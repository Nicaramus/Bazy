package PBD;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.JDOHelper;
import javax.jdo.Transaction;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		// conf.setTitle();
		// conf.setEnd_date();
		// conf.setStart_date(); //arg. 110 to rok 2011

		// System.out.println("fdf\nd\ns");
		// // Create a PersistenceManagerFactory for this datastore
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("Tutorial");
		//
		System.out.println("DataNucleus AccessPlatform with JDO");
		// System.out.println("===================================");
		//
		// // Persistence of a Product and a Book.
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		Object inventoryId = null;
		try {
			tx.begin();
			System.out.println("Persisting Conference");
			Conference conf1 = new Conference("conf1", new Timestamp(121, 12, 21, 10, 23, 12, 12),
					new Timestamp(121, 12, 29, 10, 23, 12, 12), 20, 50.5);
			Conference conf2 = new Conference("conf2", new Timestamp(121, 12, 21, 10, 23, 12, 12),
					new Timestamp(121, 12, 22, 10, 23, 12, 12), 100, 10);
			Conference conf3 = new Conference("conf3", new Timestamp(121, 12, 21, 10, 23, 12, 12),
					new Timestamp(121, 12, 21, 10, 24, 12, 12), 80, 24);
			Conference conf4 = new Conference("conf4", new Timestamp(121, 12, 21, 10, 23, 12, 12),
					new Timestamp(121, 12, 30, 10, 23, 12, 12), 30, 400);
			/*
			 * conf1.buyTicket(10); conf1.buyTicket();
			 * 
			 * conf4.buyTicket(5); conf2.buyTicket();
			 */

			User u1 = new User();
			u1.setNickname("u232");
			User u2 = new User();
			u2.setNickname("u2");

			u1.setListener();
			// u2.setListener();

			u1.getListener().buyTicket(10, conf1);
			u1.getListener().buyTicket(conf1);

			// u2.getListener().buyTicket(conf4);
			// u2.getListener().buyTicket(conf2);

			pm.makePersistent(conf1);
			pm.makePersistent(conf2);
			pm.makePersistent(conf3);
			pm.makePersistent(conf4);

			pm.makePersistent(u1);
			pm.makePersistent(u2);

			tx.commit();
			// inventoryId = pm.getObjectId(inv);
			System.out.println("Conference have been persisted");
		} catch (Exception e) {
			System.out.println("Exception persisting data : " + e.getMessage());
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		System.out.println("");

		// // Basic Extent of all Products
		pm = pmf.getPersistenceManager();
		tx = pm.currentTransaction();
		try {
			tx.begin();
			System.out.println("Retrieving Conference ");
			Extent e = pm.getExtent(Conference.class, true);
			Iterator iter = e.iterator();
			while (iter.hasNext()) {
				Object obj = iter.next();
				System.out.println(">  " + obj);
			}
			tx.commit();
		} catch (Exception e) {
			System.out.println("Exception thrown during retrieval of Extent : " + e.getMessage());
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		System.out.println("");

		// Perform some query operations
		pm = pmf.getPersistenceManager();
		tx = pm.currentTransaction();
		try {
			tx.begin();
			System.out.println("Executing Query all for Conferences ");
			Query q = pm.newQuery("SELECT FROM " + Conference.class.getName());
			// +
			// " WHERE price < 150.00 ORDER BY price ASC");
			List<Conference> products = (List<Conference>) q.execute();
			Iterator<Conference> iter = products.iterator();

			Conference max = null;
			long maxDiff = 0;

			ArrayList confBetween = new ArrayList();
			Timestamp fromtime = new Timestamp(121, 12, 20, 10, 23, 12, 12);
			Timestamp totime = new Timestamp(121, 12, 23, 10, 23, 12, 12);

			while (iter.hasNext()) {
				Conference p = iter.next();
				System.out.println(">  " + p + "  number of ticekts " + p.getFreeTickets() + "  number of reservations "
						+ p.getReservations());

				Timestamp start = p.getStart_date();
				Timestamp end = p.getEnd_date();
				long diff = end.getTime() - start.getTime();

				if (diff > maxDiff) {
					max = p;
					maxDiff = diff;
				}

				if (start.after(fromtime) && end.before(totime)) {
					confBetween.add(p);

				}

				// Give an example of an update
				if (p instanceof Conference) {
					Conference b = (Conference) p;
					b.getTitle();
					// b.setDescription("This book has been reduced in price!");
				}

			}
			System.out.println(">  " + max.getTitle() + "  the longest conference, " + maxDiff + " days");

			Iterator<Conference> iterBetween = confBetween.iterator();

			System.out.println("Conf between " + fromtime + " to " + totime);

			System.out.println(" ----- ");
			while (iterBetween.hasNext()) {

				Conference p = iterBetween.next();
				System.out.println(">  " + p.getTitle());

			}

			System.out.println(" ----- ");

			System.out.println("Conference conf3 count : ");

			q.setFilter("title == 'conf3'");
			List<Conference> selectConf = (List<Conference>) q.execute();
			Iterator<Conference> iter2 = selectConf.iterator();

			while (iter2.hasNext()) {
				Conference p = iter2.next();
				// Timestamp ts = p.getStart_date();
				// Date date = new Date();
				// date.setTime(ts.getTime());
				// String formattedDate = new
				// SimpleDateFormat("yyyyMMdd").format(date);

				System.out.println(">  " + p.getTitle() + " startDate :" + p.getStart_date() + " number of ticekts "
						+ p.getFreeTickets() + " number of reservations " + p.getReservations());

			}

			tx.commit();
		} catch (Exception e) {
			System.out.println("Exception performing queries : " + e.getMessage());
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		System.out.println("");

		// Perform some query operations for user
		pm = pmf.getPersistenceManager();
		tx = pm.currentTransaction();
		try {
			tx.begin();
			System.out.println("Executing Query all for User ");
			Query q = pm.newQuery("SELECT FROM " + User.class.getName());
			// +
			// " WHERE price < 150.00 ORDER BY price ASC");
			List<User> products = (List<User>) q.execute();
			Iterator<User> iter = products.iterator();

			Conference max = null;
			long maxDiff = 0;

			while (iter.hasNext()) {
				User p = iter.next();
				System.out.println(">  " + p);

				// Give an example of an update
				if (p instanceof User) {
					User b = (User) p;

					// b.setDescription("This book has been reduced in price!");
				}

			}

			System.out.println("Check u2 is listener  : ");

			q.setFilter("nickname == 'u2'");
			List<User> selectConf = (List<User>) q.execute();
			Iterator<User> iter2 = selectConf.iterator();

			while (iter2.hasNext()) {
				User p = iter2.next();

				System.out.println(">  " + p.getNickname() + " Listener: " + p.getListener());

			}

			tx.commit();
		} catch (Exception e) {
			System.out.println("Exception performing queries : " + e.getMessage());
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		System.out.println("");


	////////////////////////////////////////////////////////////////
		pm = pmf.getPersistenceManager();
		tx = pm.currentTransaction();
		tx.begin();

			User testUser = new User();
			pm.makePersistent(testUser);
			testUser = (User)pm.detachCopy(testUser);

			User testUser2 = new User();
			pm.makePersistent(testUser2);
			testUser2 = (User)pm.detachCopy(testUser2);
			
			tx.commit();
		


			System.out.println("\nUżytkownik o ID: " + testUser.getUserID()
			+ " próbuje zgłasza publikację, a potem próbuje ją zrecenzować.");
			testUser.setPresenter();
			Talk testTalk = testUser.getPresenter().submitTalk("Naukowa praca");
			testUser.setReviewer();
			testUser.getReviewer().createReview(testTalk, "Recenzja naukowej pracy", "Lorem ipsum x560");

			System.out.println("\nKolejny użytkownik o ID: " + testUser2.getUserID()
			+ " recenzuje prace bez komunikatu o niepowodzeniu.");
			testUser2.setPresenter();
			testUser2.setReviewer();
			testUser2.getReviewer().createReview(testTalk, "Recenzja naukowej pracy", "Lorem ipsum x560");
			 
		
        // Clean out the database
//        pm = pmf.getPersistenceManager();
//        tx = pm.currentTransaction();
//        try
//        {
//            tx.begin();
//
//            System.out.println("Retrieving Inventory using its id");
//            Inventory inv = (Inventory)pm.getObjectById(inventoryId);
//
//            System.out.println("Clearing out Inventory");
//            inv.getProducts().clear();
//
//            System.out.println("Deleting Inventory");
//            pm.deletePersistent(inv);
//
//            System.out.println("Deleting all products from persistence");
//            Query q = pm.newQuery(Product.class);
//            long numberInstancesDeleted = q.deletePersistentAll();
//            System.out.println("Deleted " + numberInstancesDeleted + " products");
//
//            tx.commit();
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception cleaning out the database : " + e.getMessage());
//        }
//        finally
//        {
//            if (tx.isActive())
//            {
//                tx.rollback();
//            }
//            pm.close();
//        }
//
//        System.out.println("");
//        System.out.println("End of Tutorial");
//        pmf.close();
//
//
    }
}

package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.awt.Image;
import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Conference {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;
    private String title;
    private String description;
    private Timestamp start_date;
    private Timestamp end_date;
    private Image logo;
    private Timestamp registration_start_date;
    private Timestamp registration_end_date;
    private int ticket_limit;

    @Persistent(mappedBy="conference")
    ArrayList<Ticket> tickets;

    public int getRegistrationNumber() {
        // TODO - implement Conference.getRegistrationNumber
        throw new UnsupportedOperationException();
    }

    public boolean isTicketAvailable() {
        // TODO - implement Conference.isTicketAvailable
        throw new UnsupportedOperationException();
    }

    public void createScheduleDay() {
        // TODO - implement Conference.createScheduleDay
        throw new UnsupportedOperationException();
    }

    public String getTitle() {
        return this.title;
    }

    /**
     * @param title
     * @throws Exception 
     */
    public void setTitle(String title){
    	if(title.matches("[a-zA-Z]{2,20}")){
    		this.title = title;
    	}else{
    		System.out.println("Niepoprawny format tytułu.");
    	}
    }

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getStart_date() {
        return this.start_date;
    }

    /**
     * @param start_date
     */
    public void setStart_date(Timestamp start_date) {
    	Date date = new Date();
    	long current = date.getTime();
    	if(current < start_date.getTime()){
    		if(end_date != null){
    			if(start_date.compareTo(end_date) == -1){
    				this.start_date = start_date;
    			}else{
    				System.out.println("Data startowa konferencji nie może być póżniejsza niż data końcowa");
    			}
    		}
    		else{
    			this.start_date = start_date;
    		}	
    	}else{
    		System.out.println("Data startowa konferencji nie może być wcześniejsza niż data aktulna.");
    	}
    }

    public Timestamp getEnd_date() {
        return this.end_date;
    }

    /**
     * @param end_date
     */
    public void setEnd_date(Timestamp end_date) {
    	Date date = new Date();
    	long current = date.getTime();
    	if(current < end_date.getTime()){
    		if(start_date != null){
    			if(start_date.compareTo(end_date) == -1){
    				this.end_date = end_date;
    			}else{
    				System.out.println("Data końcowa konferencji nie może być wcześniejsza niż data rozpoczęcia");
    			}
    		}
    		else{
    			this.end_date = end_date;
    		}	
    	}else{
    		System.out.println("Data końcowa konferencji nie może być wcześniejsza niż data aktulna.");
    	}
    }

    public Image getLogo() {
        return this.logo;
    }

    /**
     * @param logo
     */
    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public Timestamp getRegistration_start_date() {
        return this.registration_start_date;
    }

    /**
     * @param registration_start_date
     */
    public void setRegistration_start_date(Timestamp registration_start_date) {
        this.registration_start_date = registration_start_date;
    }

    public Timestamp getRegistration_end_date() {
        return this.registration_end_date;
    }

    /**
     * @param registration_end_date
     */
    public void setRegistration_end_date(Timestamp registration_end_date) {
        this.registration_end_date = registration_end_date;
    }

    public int getTicket_limit() {
        return this.ticket_limit;
    }

    /**
     * @param ticket_limit
     */
    public void setTicket_limit(int ticket_limit) {
		if (ticket_limit >= 0) {
			this.ticket_limit = ticket_limit;
		} else {
			System.out.println("Limit biletów nie może być liczbą ujemną.");
		}
    }

}

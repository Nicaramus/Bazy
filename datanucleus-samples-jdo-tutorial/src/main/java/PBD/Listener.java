package PBD;

import javax.jdo.annotations.*;
import java.util.ArrayList;

/**
 * Definition of class
 */
@PersistenceCapable
public class Listener {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;

    @Column(name="user_id")
    @ForeignKey
    private User userOfListener;

    @Element(column="listener_id")
    ArrayList<Ticket> tickets;

	public Listener(User u)
	{
	tickets=new ArrayList();
userOfListener=u;

	}

   public void buyTicket(int n, Conference c) {
		
	Ticket t = c.buyTicket(n, this);
	//tickets.add(t);

    }
public void buyTicket( Conference c) {
		
	Ticket t = c.buyTicket(1, this);
//tickets.add(t);

    }

@Override
public String toString()
{
return "user is listener";
}

}

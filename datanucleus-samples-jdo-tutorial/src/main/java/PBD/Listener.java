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

    public void buyTicket() {
        // TODO - implement Listener.buyTicket
        throw new UnsupportedOperationException();
    }

}

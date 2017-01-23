package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.ForeignKey;


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
    private User user;

    public void buyTicket() {
        // TODO - implement Listener.buyTicket
        throw new UnsupportedOperationException();
    }

}

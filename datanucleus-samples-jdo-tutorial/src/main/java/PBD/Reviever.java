package PBD;

import javax.jdo.annotations.*;

/**
 * Definition of class
 */
@PersistenceCapable
public class Reviever {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;

    @Column(name="user_id")
    private User userOfReviewer;

    public void createReview() {
        // TODO - implement Reviever.createReview
        throw new UnsupportedOperationException();
    }

    public void addSpecialization() {
        // TODO - implement Reviever.addSpecialization
        throw new UnsupportedOperationException();
    }

}

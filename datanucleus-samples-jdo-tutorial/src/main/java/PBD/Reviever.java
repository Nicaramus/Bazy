package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Reviever {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;

    public void createReview() {
        // TODO - implement Reviever.createReview
        throw new UnsupportedOperationException();
    }

    public void addSpecialization() {
        // TODO - implement Reviever.addSpecialization
        throw new UnsupportedOperationException();
    }

}

package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Manager {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;

    public void createConference() {
        // TODO - implement Manager.createConference
        throw new UnsupportedOperationException();
    }

    public void editConference() {
        // TODO - implement Manager.editConference
        throw new UnsupportedOperationException();
    }

}

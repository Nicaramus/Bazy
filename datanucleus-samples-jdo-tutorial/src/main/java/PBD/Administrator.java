package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Administrator {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;

    public void addUser() {
        // TODO - implement Administrator.addUser
        throw new UnsupportedOperationException();
    }

    public void deleteUser() {
        // TODO - implement Administrator.deleteUser
        throw new UnsupportedOperationException();
    }

    public void grantUser() {
        // TODO - implement Administrator.grantUser
        throw new UnsupportedOperationException();
    }

    public void revokeUser() {
        // TODO - implement Administrator.revokeUser
        throw new UnsupportedOperationException();
    }

}

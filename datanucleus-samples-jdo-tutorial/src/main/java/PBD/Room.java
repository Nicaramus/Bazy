package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Room {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;
    private int size;
    private String number;

    public int getSize() {
        return this.size;
    }

    /**
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    public String getNumber() {
        return this.number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

}

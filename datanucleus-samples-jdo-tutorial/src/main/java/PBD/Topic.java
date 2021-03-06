package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import java.util.ArrayList;
import java.util.Set;

/**
 * Definition of class
 */
@PersistenceCapable
public class Topic {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;
    private String name;

    @Persistent(mappedBy="topics")
    Set<Reviewer> reviewers;

    @Persistent(mappedBy="topic")
    ArrayList<Talk> talks;

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}

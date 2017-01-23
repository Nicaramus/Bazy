package PBD;

import javax.jdo.annotations.*;
import java.util.ArrayList;
import java.util.Set;

/**
 * Definition of class
 */
@PersistenceCapable
public class Reviewer {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;

    @Persistent(table="topics_reviewers")
    @Join(column="reviewer_id")
    @Element(column="topic_id")
    Set<Topic> topics;

    @Column(name="user_id")
    private User userOfReviewer;

    @Persistent(mappedBy="reviewer")
    ArrayList<Review> reviews;

    public void createReview() {
        // TODO - implement Reviewer.createReview
        throw new UnsupportedOperationException();
    }

    public void addSpecialization() {
        // TODO - implement Reviewer.addSpecialization
        throw new UnsupportedOperationException();
    }



}

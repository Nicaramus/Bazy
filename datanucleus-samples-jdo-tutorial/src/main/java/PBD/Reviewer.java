package PBD;

import javax.jdo.annotations.*;
import java.util.ArrayList;
import java.util.HashSet;
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
    private final User userOfReviewer;

    @Persistent(mappedBy="reviewer")
    ArrayList<Review> reviews;

    public Reviewer(User user){
    	this.userOfReviewer = user;
    	this.reviews = new ArrayList<Review>();
    	this.topics = new HashSet<Topic>();
    }
    
    public void createReview(Talk talk) {
    	if(!isReviewable(talk)){
    		Review review = new Review(this, talk);
    		addReview(review);
    	}
    }
    
    public void createReview(Talk talk, String title, String content) {
    	if(!isReviewable(talk)){
    		Review review = new Review(this, talk, title, content);
    		addReview(review);
    	}
    }

    private void addReview(Review review){
    	reviews.add(review);
		if(reviews != null){
			reviews.add(review);
		}else{
			reviews = new ArrayList<Review>();
			reviews.add(review);
		}
    }
    
    private boolean isReviewable(Talk talk){
    	if(userOfReviewer.getUserID() == talk.getPresenter().getUserID()){
			System.out.println("Nie można zrecenzować swojej własnej pracy.");
			return false;
			//throw new UnsupportedOperationException("Nie można zrecenzować swojej własnej pracy.");
		}
    	
    	for(Review r: reviews){
    		if(r.talk == talk){
    			System.out.println("Recenzja dla danej publikacji już istnieje.");
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public void addSpecialization() {
        // TODO - implement Reviewer.addSpecialization
        throw new UnsupportedOperationException();
    }



}

package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.util.ArrayList;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Presenter {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;
    
    @Column(name="user_id")
    private final User userOfPresenter;
    
    @Persistent(mappedBy="presenter")
    ArrayList<Talk> talks;

    
    public Presenter(User user){
    	this.userOfPresenter = user;
    	this.talks = new ArrayList<Talk>();
    }
    
    public long getUserID(){
    	return userOfPresenter.getUserID();
    }
    
    public Talk submitTalk(String title) {
        Talk talk = new Talk(title, this);
        talks.add(talk);
        return talk;
    }

    public void editTalk() {
        // TODO - implement Presenter.editTalk
        throw new UnsupportedOperationException();
    }

    public void deleteTalk() {
        // TODO - implement Presenter.deleteTalk
        throw new UnsupportedOperationException();
    }

}

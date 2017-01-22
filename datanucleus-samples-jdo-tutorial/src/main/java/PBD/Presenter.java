package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
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

    public void submitTalk() {
        // TODO - implement Presenter.submitTalk
        throw new UnsupportedOperationException();
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

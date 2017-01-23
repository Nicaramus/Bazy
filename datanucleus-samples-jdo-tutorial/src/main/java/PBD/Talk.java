package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.sql.Date;
import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Talk {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;
    private String title;
    private String description;
    private String slides;
    private boolean is_public;
    private boolean highted;
    private Date start_time;

    public String getTitle() {
        return this.title;
    }

    Topic topic;

    @Persistent(mappedBy="talk")
    ArrayList<Review> talkReviews;

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlides() {
        return this.slides;
    }

    /**
     * @param slides
     */
    public void setSlides(String slides) {
        this.slides = slides;
    }

    public boolean getIs_public() {
        return this.is_public;
    }

    /**
     * @param is_public
     */
    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }

    public boolean getHighted() {
        return this.highted;
    }

    /**
     * @param highted
     */
    public void setHighted(boolean highted) {
        this.highted = highted;
    }

    public Date getStart_time() {
        return this.start_time;
    }

    /**
     * @param start_time
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

}

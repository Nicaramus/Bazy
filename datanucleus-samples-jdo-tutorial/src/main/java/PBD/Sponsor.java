package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.awt.Image;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Sponsor {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
    private long id;
    private String name;
    private String description;
    private String website;
    private Image logo;

    public void donate() {
        // TODO - implement Sponsor.donate
        throw new UnsupportedOperationException();
    }

    public double sumDonations() {
        // TODO - implement Sponsor.sumDonations
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    public String getWebsite() {
        return this.website;
    }

    /**
     * @param website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    public Image getLogo() {
        return this.logo;
    }

    /**
     * @param logo
     */
    public void setLogo(Image logo) {
        this.logo = logo;
    }

}

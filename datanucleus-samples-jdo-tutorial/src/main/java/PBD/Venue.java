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
public class Venue {

  @PrimaryKey
  @Persistent(valueStrategy=IdGeneratorStrategy.NATIVE)
  private long id;
	private String name;
	private String website;
	private String description;
	private String country;
	private String city;
	private String street;
	private String postal_code;
	private String latitude;
	private String longtitude;
	private Image photo;

	public void getAvailableRooms() {
		// TODO - implement Venue.getAvailableRooms
		throw new UnsupportedOperationException();
	}

	public void createRoom() {
		// TODO - implement Venue.createRoom
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return this.website;
	}

	/**
	 *
	 * @param website
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountry() {
		return this.country;
	}

	/**
	 *
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return this.city;
	}

	/**
	 *
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

	/**
	 *
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostal_code() {
		return this.postal_code;
	}

	/**
	 *
	 * @param postal_code
	 */
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getLatitude() {
		return this.latitude;
	}

	/**
	 *
	 * @param latitude
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return this.longtitude;
	}

	/**
	 *
	 * @param longtitude
	 */
	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public Image getPhoto() {
		return this.photo;
	}

	/**
	 *
	 * @param photo
	 */
	public void setPhoto(Image photo) {
		this.photo = photo;
	}

}

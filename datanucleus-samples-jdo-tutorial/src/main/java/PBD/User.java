package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.sql.Timestamp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class User {

  @PrimaryKey
  @Persistent(valueStrategy=IdGeneratorStrategy.NATIVE)
  private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String password_reset_token;
	private Timestamp password_reset_sent_at;
	private int confirmation_token;
	private Timestamp confirmed_at;
	private String bio;
	private String nickname;
	private String phone;
	private String affilaction;
	private String email_public;
	private boolean phone_public;

	public void create() {
		// TODO - implement User.create
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement User.update
		throw new UnsupportedOperationException();
	}

	public String getFirstname() {
		return this.firstname;
	}

	/**
	 *
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	/**
	 *
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 *
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 *
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_reset_token() {
		return this.password_reset_token;
	}

	/**
	 *
	 * @param password_reset_token
	 */
	public void setPassword_reset_token(String password_reset_token) {
		this.password_reset_token = password_reset_token;
	}

	public Timestamp getPassword_reset_sent_at() {
		return this.password_reset_sent_at;
	}

	/**
	 *
	 * @param password_reset_sent_at
	 */
	public void setPassword_reset_sent_at(Timestamp password_reset_sent_at) {
		this.password_reset_sent_at = password_reset_sent_at;
	}

	public void getConfirmation_token() {
		// TODO - implement User.getConfirmation_token
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param confirmation_token
	 */
	public void setConfirmation_token(int confirmation_token) {
		this.confirmation_token = confirmation_token;
	}

	public Timestamp getConfirmed_at() {
		return this.confirmed_at;
	}

	/**
	 *
	 * @param confirmed_at
	 */
	public void setConfirmed_at(Timestamp confirmed_at) {
		this.confirmed_at = confirmed_at;
	}

	public String getBio() {
		return this.bio;
	}

	/**
	 *
	 * @param bio
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getNickname() {
		return this.nickname;
	}

	/**
	 *
	 * @param nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return this.phone;
	}

	/**
	 *
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAffilaction() {
		return this.affilaction;
	}

	/**
	 *
	 * @param affilaction
	 */
	public void setAffilaction(String affilaction) {
		this.affilaction = affilaction;
	}

	public String getEmail_public() {
		return this.email_public;
	}

	/**
	 *
	 * @param email_public
	 */
	public void setEmail_public(String email_public) {
		this.email_public = email_public;
	}

	public boolean getPhone_public() {
		return this.phone_public;
	}

	/**
	 *
	 * @param phone_public
	 */
	public void setPhone_public(boolean phone_public) {
		this.phone_public = phone_public;
	}

}

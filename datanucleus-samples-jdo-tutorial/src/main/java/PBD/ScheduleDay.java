package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.sql.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class ScheduleDay {

  @PrimaryKey
  @Persistent(valueStrategy=IdGeneratorStrategy.NATIVE)
  private long id;
	private boolean is_public;
	private Date data;

	public void createTalk() {
		// TODO - implement ScheduleDay.createTalk
		throw new UnsupportedOperationException();
	}

	public void deleteTalk() {
		// TODO - implement ScheduleDay.deleteTalk
		throw new UnsupportedOperationException();
	}

	public boolean getIs_public() {
		return this.is_public;
	}

	/**
	 *
	 * @param is_public
	 */
	public void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}

	public Date getData() {
		return this.data;
	}

	/**
	 *
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}

}

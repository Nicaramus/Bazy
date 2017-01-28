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
public class Review {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
	private long id;
	private String title;
	private String content;
	private Date deadline;
	private int grade;

	Reviewer reviewer;
	Talk talk;

	
	public Review(Reviewer reviewer, Talk talk){
		this.reviewer = reviewer;
		this.talk = talk;
	}
	
	public Review(Reviewer reviewer, Talk talk, String title, String content){
		this.reviewer = reviewer;
		this.talk = talk;
		setTitle(title);
		setContent(content);
	}
	
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		 // TODO - implement validation
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	/**
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	/**
	 * @param deadline
	 */
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public int getGrade() {
		return this.grade;
	}

	/**
	 * @param grade
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

}

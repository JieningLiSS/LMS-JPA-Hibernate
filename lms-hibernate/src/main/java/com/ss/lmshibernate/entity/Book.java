package com.ss.lmshibernate.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Book {
		
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	 
	 @Column(name = "title") 
	private String title;
	
	 @Column(name = "authId") 
	private Integer authId;
	 
	 @Column(name = "pubId") 
	private Integer pubId;

	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the authId
	 */
	public Integer getAuthId() {
		return authId;
	}

	/**
	 * @param authId the authId to set
	 */
	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	/**
	 * @return the pubId
	 */
	public Integer getPubId() {
		return pubId;
	}

	/**
	 * @param pubId the pubId to set
	 */
	public void setPubId(Integer pubId) {
		this.pubId = pubId;
	}
	 
	

}

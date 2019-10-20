package com.ss.lmshibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@IdClass(BookLoanId.class)
@Table(name = "tbl_book_loans")
public class BookLoan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "dateOut", columnDefinition = "DATE")
	private Date dateOut;

	@Column(name = "dueDate", columnDefinition = "DATE")
	private Date dueDate;

	@Id
	@Column(name = "bookId")
	private Long bookId;
	@Id
	@Column(name = "branchId")
	private Long branchId;
	@Id
	@Column(name = "cardNo")
	private Long cardNo;

	/**
	 * @return the dateOut
	 */
	public Date getDateOut() {
		return dateOut;
	}

	/**
	 * @param dateOut the dateOut to set
	 */
	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the bookId
	 */
	public Long getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the branchId
	 */
	public Long getBranchId() {
		return branchId;
	}

	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	/**
	 * @return the cardNo
	 */
	public Long getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

}

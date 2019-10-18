//package com.ss.lmshibernate.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "tbl_book_loans")
//public class BookLoans implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Column(name = "dateOut", columnDefinition = "DATE")
//	private LocalDate dateOut;
//	
//	@Column(name = "dueDate", columnDefinition = "DATE")
//	private LocalDate dueDate;
//	
//	@Id
//	  @Column(name = "bookId")
//	  private Integer bookId;
//	@Id
//	  @Column(name = "branchId")
//	  private Integer branchId;
//	@Id
//	  @Column(name = "cardNo")
//	  private Integer cardNo;
//
//	  
//	/**
//	 * @return the dateOut
//	 */
//	public LocalDate getDateOut() {
//		return dateOut;
//	}
//
//	/**
//	 * @param dateOut the dateOut to set
//	 */
//	public void setDateOut(LocalDate dateOut) {
//		this.dateOut = dateOut;
//	}
//
//	/**
//	 * @return the dueDate
//	 */
//	public LocalDate getDueDate() {
//		return dueDate;
//	}
//
//	/**
//	 * @param dueDate the dueDate to set
//	 */
//	public void setDueDate(LocalDate dueDate) {
//		this.dueDate = dueDate;
//	}
//
//	/**
//	 * @return the bookId
//	 */
//	public Integer getBookId() {
//		return bookId;
//	}
//
//	/**
//	 * @param bookId the bookId to set
//	 */
//	public void setBookId(Integer bookId) {
//		this.bookId = bookId;
//	}
//
//	/**
//	 * @return the branchId
//	 */
//	public Integer getBranchId() {
//		return branchId;
//	}
//
//	/**
//	 * @param branchId the branchId to set
//	 */
//	public void setBranchId(Integer branchId) {
//		this.branchId = branchId;
//	}
//
//	/**
//	 * @return the cardNo
//	 */
//	public Integer getCardNo() {
//		return cardNo;
//	}
//
//	/**
//	 * @param cardNo the cardNo to set
//	 */
//	public void setCardNo(Integer cardNo) {
//		this.cardNo = cardNo;
//	}
//	  
//
//}

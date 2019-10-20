package com.ss.lmshibernate.entity;

import java.io.Serializable;

public class BookLoanId implements Serializable {

	private Long branchId;
	private Long bookId;
	private Long cardNo;

	public BookLoanId() {

	}

	public BookLoanId(Long branchId, Long bookId, Long cardNo) {
		this.branchId = branchId;
		this.bookId = bookId;
		this.bookId = bookId;
	}

	public Long getBranchId() {
		return branchId;
	}

	public Long getBookId() {
		return bookId;
	}

	public Long getCardNo() {
		return cardNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + branchId + bookId + cardNo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookLoanId other = (BookLoanId) obj;
		if (bookId != other.bookId) {
			return false;
		} else if (cardNo != other.cardNo)
			return false;
		else if (branchId != other.branchId)
			return false;
		return true;
	}
}
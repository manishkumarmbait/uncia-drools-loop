package com.uncia.loop.model;

public class Response {

	private Double loanDue;

	public Double getLoanDue() {
		return loanDue;
	}

	public void setLoanDue(Double loanDue) {
		this.loanDue = loanDue;
	}

	@Override
	public String toString() {
		return "Response [loanDue=" + loanDue + "]";
	}

}

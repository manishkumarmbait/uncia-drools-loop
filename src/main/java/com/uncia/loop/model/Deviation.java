package com.uncia.loop.model;

public class Deviation {

	String loanType;
	Integer indicator;
	Integer suitFiled;
	Integer writtenOff;
	Double loanDue;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Integer getIndicator() {
		return indicator;
	}

	public void setIndicator(Integer indicator) {
		this.indicator = indicator;
	}

	public Integer getSuitFiled() {
		return suitFiled;
	}

	public void setSuitFiled(Integer suitFiled) {
		this.suitFiled = suitFiled;
	}

	public Integer getWrittenOff() {
		return writtenOff;
	}

	public void setWrittenOff(Integer writtenOff) {
		this.writtenOff = writtenOff;
	}

	public Double getLoanDue() {
		return loanDue;
	}

	public void setLoanDue(Double loanDue) {
		this.loanDue = loanDue;
	}

}

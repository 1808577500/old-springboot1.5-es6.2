package com.test.es.controller;



public class CardInfo {
	private String cardNum;
	
	private String pwd;

	@Override
	public String toString() {
		return "CardInfo [cardNum=" + cardNum + ", pwd=" + pwd + "]";
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}

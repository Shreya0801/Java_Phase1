package model;

import java.io.Serializable;

public class CreditCard implements Serializable{
	
	private long ccNumber;
	private String cardHolderName;
	private String bankName;
	private String cardType;
	private transient int cvv;
	
	public CreditCard() {
		
	}

	public CreditCard(long ccNumber, String cardHolderName, String bankName, String cardType, int cvv) {
		
		this.ccNumber = ccNumber;
		this.cardHolderName = cardHolderName;
		this.bankName = bankName;
		this.cardType = cardType;
		this.cvv = cvv;
	}

	public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CreditCard [ccNumber=" + ccNumber + ", cardHolderName=" + cardHolderName + ", bankName=" + bankName
				+ ", cardType=" + cardType + ", cvv=" + cvv + "]";
	}
	
	
	
	
}

package com.sattrix.apidemo.entity;

import java.io.Serializable;

public class Transaction implements Serializable{

	private static final long serialVersionUID = 5298218868993582075L;
	
	public Integer transaction_id;
	public String status;
	public String type;
	public double epoch;
	public double amount;
	public String currency;
	public int to_account_number;
	public int from_account_number;
	
	public Transaction(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	public Transaction() {}
	
	public Transaction(Integer transaction_id, String status, String type, double epoch, double amount, String currency,
			int to_account_number, int from_account_number) {
		super();
		this.transaction_id = transaction_id;
		this.status = status;
		this.type = type;
		this.epoch = epoch;
		this.amount = amount;
		this.currency = currency;
		this.to_account_number = to_account_number;
		this.from_account_number = from_account_number;
	}
	public Integer getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getEpoch() {
		return epoch;
	}
	public void setEpoch(double epoch) {
		this.epoch = epoch;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getTo_account_number() {
		return to_account_number;
	}
	public void setTo_account_number(int to_account_number) {
		this.to_account_number = to_account_number;
	}
	public int getFrom_account_number() {
		return from_account_number;
	}
	public void setFrom_account_number(int from_account_number) {
		this.from_account_number = from_account_number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction_id == null) ? 0 : transaction_id.hashCode());
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
		Transaction other = (Transaction) obj;
		if (transaction_id == null) {
			if (other.transaction_id != null)
				return false;
		} else if (!transaction_id.equals(other.transaction_id))
			return false;
		return true;
	}
	
	
}


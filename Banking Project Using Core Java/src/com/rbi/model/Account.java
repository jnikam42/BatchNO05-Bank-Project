package com.rbi.model;

public class Account 
{
	private int CostumerId;
	private String CostumerName;
	private String PanNo;
	private String MoNo;
	private String Address;
	private String Password;
	private double Money;
	public int getCostumerId() {
		return CostumerId;
	}
	public void setCostumerId(int costumerId) {
		CostumerId = costumerId;
	}
	public String getCostumerName() {
		return CostumerName;
	}
	public void setCostumerName(String costumerName) {
		CostumerName = costumerName;
	}
	public String getPanNo() {
		return PanNo;
	}
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	public String getMoNo() {
		return MoNo;
	}
	public void setMoNo(String moNo) {
		MoNo = moNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}
	
}

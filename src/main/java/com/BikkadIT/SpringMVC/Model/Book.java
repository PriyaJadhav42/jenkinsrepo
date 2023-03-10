package com.BikkadIT.SpringMVC.Model;

public class Book {
	private int Bid;
	private String BName;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public Double getBPrice() {
		return BPrice;
	}
	public void setBPrice(Double bPrice) {
		BPrice = bPrice;
	}
	private Double BPrice;
	

}

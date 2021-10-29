package com.yedam.java.pos;

public class Shop {

	//필드
	private String shopName;
	private int money;
	
	//생성자
	public Shop(String shopName, int money) {
		this.shopName = shopName;
		this.money = money;
	}
	
	//메소드
	public void takeMoney(Product product) {
		this.price += price;
		this.customerCount++;
	}
	
	public void showInfo() {
		System.out.println("오늘 고객 수는 " + customerCount + "이고, 총 매출은 " + price + "원입니다."); 
	}
}

package com.yedam.java.pos;

public class Product {

	// 필드
	private String ProductName;
	private int customerCount;
	private int price;

	public Product(String ProductName, int price) {
		this.ProductName = ProductName;
		this.price = price;
	}

	// 메소드
	public void sellProduct(int price) {
		this.price += price;
		this.customerCount++;
	}

	public void showInfo() {
		System.out.println("오늘 고객 수는 " + customerCount + "이고, 총 매출은 " + price + "원입니다.");
	}
}

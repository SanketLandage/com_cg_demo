package com.cg.demo.method;

public class Product {
	int prodNum;
	String prodName;
	double prodPrice;
	String grade;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int prodNum, String prodName) {
		super();
		this.prodNum = prodNum;
		this.prodName = prodName;
	}
	

//	@Override
//	public String toString() {
//		return "Product [prodNum=" + prodNum + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", grade="
//				+ grade + "]";
//	}


	public Product(int prodNum, String prodName, double prodPrice, String grade) {
		super();
		this.prodNum = prodNum;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.grade = grade;
	}
	
	
	
//	Product(int prodNum , String prodName , double prodPrice , String grade){
//		this.prodNum = prodNum;
//		this.prodName = prodName;
//		this.prodPrice = prodPrice;
//		this.grade = grade;
//	}
//	
//	@Override
//    public String toString() {
//        return "PRODUCT [productNumber=" + prodNum + ", ProductName=" + prodName + ", ProductPrice = " + prodPrice + ", ProductGrade = " + grade +"]";
//    }
}

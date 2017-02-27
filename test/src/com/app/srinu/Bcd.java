package com.app.srinu;

public class Bcd {
	int a;
	int b;
	public Bcd() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");

	}
	public Bcd(int a,int b) {
		// TODO Auto-generated constructor stub
		
		this.a=a;
		this.b=b;
		
		System.out.println("param constructor"+a+b);
		
	}
	public void ADC(){
		
	}
	public static void main(String... args) {
		Bcd bc=new Bcd(10,12);
		
	}
	
	

}

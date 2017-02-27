package com.app.srinu;

public class Argument {

	int a;
	
	void m(Argument obj){
		obj.a=10;
		System.out.println("metho  d id allowed" +a);
	}
	void p(){
		m(this);
	}
	public static void main(String[] args) {
		Argument a=new Argument();
		a.p();
		System.out.println(a);
	}
}

package com.app.srinu;

import java.util.Scanner;

public class EvenOrOdd {
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter any number:");
		//int a=s.nextInt();
		//System.out.println(a);
for (int j2 = 0; j2 < 10; j2++) {
	if(j2%2==0){
		Thread.sleep(1000);
		System.out.println(j2+" is even number");
	}
	else{
		System.out.println(j2+" is odd number");
	}
	
	
}
	}

}

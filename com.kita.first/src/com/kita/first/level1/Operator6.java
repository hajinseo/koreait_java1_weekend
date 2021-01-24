package com.kita.first.level1;

public class Operator6 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		int n3 = 3;
		
		boolean result1;
		boolean result2;
		boolean result3;
		result1 = (n1 == n2 && n2 == n3 && n3 == n1);
		result2 = (n1 == n2 || n2 == n3 || n3 == n1);
		System.out.println(result1); //and 연산자
		System.out.println(result2); //or 연산자
		
	}

}

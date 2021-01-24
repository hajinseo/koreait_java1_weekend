package com.kita.first.level1;

public class Operator5 {
	public static void main(String[] args) {
		//비교 연산자
		int n1 = 3;
		int n2 = 4;
		System.out.println(n1 == n2 + '\n');
		
		boolean result = n1 == n2;
		//boolean자료형 값이 나오는 연산자..
		n2 = 3;
		result = n1 == n2;
		System.out.println(result + "\n");
		System.out.println(!result + "\n");
		System.out.println(!!result + "\n");
		
		result = (n1 >= n2);
		System.out.println(result + "\n");
		
		n2 = 5;
		result = (n1 != n2 + '\n');
		System.out.println(result); //같지 않다.. 같지 않으면 True 같으면 False
	}

}

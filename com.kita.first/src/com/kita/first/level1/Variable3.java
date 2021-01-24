package com.kita.first.level1;

public class Variable3 {
	public static void main(String[] args) {
		int v1 = 3;
		int v2 = 5;
		System.out.println(v1 + v2);
		int result1 = (v1 + v2);
		System.out.println(result1);
		
		double v3 = 2.4;
		int result2 = v1 + (int)v3;
		System.out.println(result2);
		
		long v4 = 12L;
		double result3 = v4;
		float result4 = v4;
		
		//각 자료형들의 POWER확인
		//byte < short < int < long < String ==> 이런식으로의 진행..
		System.out.println(1 + 2 + 3);
		System.out.println(1 + "2" + 3);
		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3); //앞에서 부터 차례대로 인식해서 123으로 출력함.
		
		String s1 = "123";
		int n1 = Integer.parseInt(s1); //메소드를 사용하여 문자열을 int형으로 변환함 (강제 형변환)
		int n2 = 1;
		System.out.println(n1 + n2);
	}
}

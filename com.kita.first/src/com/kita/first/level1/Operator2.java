package com.kita.first.level1;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 3;
		System.out.println(n1++);
		System.out.println(n1);
		System.out.println(++n1); //언제 증감처리를 하느냐에 따라 처리 순서가 달라져 값이 달라진다.
		System.out.println(n1);
		System.out.println(n1--);
		System.out.println(n1);
		System.out.println(--n1);
	}
}

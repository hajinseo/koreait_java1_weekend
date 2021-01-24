package com.kita.first.level1;

public class Operator3 {
	public static void main(String[] args) {
		 int n1 = 27;
		 int n2 = 4;
		 System.out.println(n1 - n2);
		 System.out.println(n1 + n2);
		 System.out.println(n1 * n2);
		 System.out.println(n1 / n2);
		 System.out.println(n1 % n2);
		 double result1 = (double)n1 / n2; //강제 형변환의 개입으로 인해 int형의 자료가 double로 변경됨.
		 System.out.println(result1);
	}
}

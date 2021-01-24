package com.kita.first.level1;

public class Review1 {
	public static void main(String[] args) {
		//자동 형변환
		int v1 = 5;
		int v2 = 8;
		long v3;
		v3 = v2;
		System.out.println(v3);
		
		//강제 형변환
		int v4 = 6;
		long v5 = 8;
		int result = v4 + (int)v5;
		System.out.println(result);
	}

}

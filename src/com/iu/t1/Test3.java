package com.iu.t1;

public class Test3 {

	public static void main(String[] args) {
		double d =  Math.ceil(6.72); //올림
//		System.out.println(d);
		d= 6.12;
		d = Math.floor(d); // 내림
//		System.out.println(d);
		d = 6.48;
		d = Math.round(d);
//		System.out.println(d); // 반올림
		
		d = Math.random();
		System.out.println(d);
		d = d * 10;
		d = Math.floor(d);
		int d2 = (int)d;
		System.out.println(d2);
		// 0 - 9
		
		
		
	}

}

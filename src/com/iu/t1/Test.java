package com.iu.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//주민등록 번호 입력 991122 2345678
		Scanner sc = new Scanner(System.in);
		//나이
		//계절
		//성별
		int age = 0;
		int season = 0;
		int gender = 0;
		System.out.println("주민번호를 입력하세요.");
		String id = sc.nextLine();
		
		//나이
		String id2 = id.substring(0, 2);
//		Integer change = new Integer(id2);
//		age = change.intValue();
		age = Integer.parseInt(id2);
		
		//계절
		id2 = id.substring(2, 4);
//		Integer change2 = new Integer(id3);
//		season = change2.intValue();
		season = Integer.parseInt(id2);
//		System.out.println(season);
		if(season >= 3 && season <=5){
			System.out.println("태어난 계절은 봄입니다.");
		}else if(season >= 6 && season <= 8){
			System.out.println("태어난 계절은 여름입니다.");
		}else if(season >= 9 && season <= 11) {
			System.out.println("태어난 계절은 가을입니다.");
		}else {
			System.out.println("태어난 계절은 겨울입니다.");
		}
		//성별
		id2 = id.substring(7, 8);
//		Integer change3 = new Integer(id4);
//		gender = change3.intValue();
		gender = Integer.parseInt(id2);
//		if (gender == 1) {
//			System.out.println("성별은 남성입니다.");
//		}else if(gender == 2) {
//			System.out.println("성별은 여성입니다.");
//		}else if(gender == 3) {
//			System.out.println("성별은 남성입니다.");
//		}else if(gender == 4) {
//			System.out.println("성별은 여성입니다.");
//		}
		if (gender%2 == 1) {
			System.out.println("성별은 남성입니다.");
		} else{
			System.out.println("성별은 여성입니다.");
		}
		
		
		if (gender == 1 || gender == 2) {
			age = 19-age+101;
		}else if (gender == 3 || gender == 4) {
			age = 19-age+1;
		}
		System.out.println("나이는"+age+"살 입니다.");
		
//	System.out.println(id);
		
	}

}

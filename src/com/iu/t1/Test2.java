package com.iu.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//주민등록번호 입력
		//991222-2345678
		//실제로 맞는 번호인지 아닌지 판별
		// 9 7 1 2 2 2 - 1 2 3 4 5 6 7
		// * * * * * *   * * * * * * 검증용
	  //1. 2 3 4 5 6 7   8 9 2 3 4 5 
	 //2. 18 21 4 10 12 14 - 8 18 6 12 20 30 (검증) = 173
		//3. 173 % 11 = 몫 15 나머지 8
		
		//4. 11 - 8(나머지) = 3(결과값)
		//4-1. 결과값이 두자리면 
		//		결과값 / 10 -- 나머지 결과값 == 검증용 번호 끝부분
		//5. 결과값(3) = 검증용 번호 7
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민번호를 입력하세요.");
//		String input = sc.nextLine();
		String input = "9712221234567";
		String [] id = new String[input.length()];
		int [] id2 = new int[input.length()];
		for (int i = 0; i < input.length()-1; i++) {
			
			String in = new String();
			in = input.substring(i,i+1);
			Integer input2 = new Integer(in);
			input2 = input2.intValue();
			id[i] = in;
			id2[i] = Integer.parseInt(id[i]);
		}
		int [] id3 = new int[input.length()];
		for (int i = 0; i < id2.length-5; i++) {
			id3[i] = id2[i]*(i+2);
			System.out.println(id3[i]);
		}
		for (int i = 9; i < id2.length-1; i++) {
			id3[i] = id2[i]*(i-8);
			System.out.println(id3[i]);
		}
		
		System.out.println("1234");
		

		System.out.println("수정중");
	
	
	
	
	
	}

}

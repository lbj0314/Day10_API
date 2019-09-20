package com.iu.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//주민등록번호 입력
		//971222-2345678
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

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		//		String input = sc.nextLine();
		String jumin = "971222-1234567";
		int sum = 0;
		int idx = 0;

		//1. splite
		String [] jumins = jumin.split("");

		//2. subString
		for (int i = 0; i < jumin.length(); i++) {
			if (i == 6) {
				continue;
			}
			String n1 = new String();
			n1 = jumin.substring(i,i+1);
			int n = Integer.parseInt(n1);

		}
		//3. charAt
		for (int i = 0; i < jumin.length()-1; i++) {
			if (i == 6) {
				continue;
			}
			char ch = jumin.charAt(i);
			String n1 = String.valueOf(ch);
			int n = Integer.parseInt(n1);
			sum = sum + n * idx;
			idx++;
			if (idx == 10) {
				idx = 2;
			}//if
		}//for
		sum = sum % 11;
		sum = 11 - sum;
		if (sum > 9) {
			sum = sum % 10;
		}

		int result = Integer.parseInt((String.valueOf(jumin.charAt(jumin.length()-1))));



		if (sum == result) {
			System.out.println("맞는 주민번호");
		}else {
			System.out.println("틀린 번호");
		}

	}

}

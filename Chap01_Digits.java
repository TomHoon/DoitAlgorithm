package Algorithm;

import java.util.Scanner;

//2자리의 양수(10~99)를 입력합니다.
public class Chap01_Digits {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("두 자리의 정수를 입력하세요 : ");
		do {
			num = sc.nextInt();	
		} while (num < 10 || num > 99);
		
		System.out.println("입력한 두 자리의 양수는" + num + "입니다.");
	}
}

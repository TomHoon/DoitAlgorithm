package Algorithm;

import java.util.Scanner;

//음수,0,양수 판단
public class Chap01_JudgeSign {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>0)
			System.out.println("양수입니다.");
		
		if(a<0)
			System.out.println("음수입니다.");
		
		if(a==0)
			System.out.println("0입니다.");
	}
}

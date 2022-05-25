package Algorithm;

import java.util.Scanner;

public class Chap01_MaxPrac {
	
	static int max4(int a, int b, int c, int d){
		int max = a;
		
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		if(d>max)
			max = d;
		
		return max;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("b를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.print("c를 입력하세요 : ");
		int c = sc.nextInt();
		
		System.out.print("d를 입력하세요 : ");
		int d = sc.nextInt();
		
		int max = max4(a,b,c,d);
		System.out.println("max의 값은 : " + max);
	}
}

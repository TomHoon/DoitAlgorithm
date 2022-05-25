package Algorithm;

import java.util.Scanner;

public class Chap01_Min3 {
//3개의 숫자를 입력 받는다.
//입력 받은 숫자 중 최솟값을 출력한다.
	
	static int min3(int a, int b, int c){
		int min = a;
		
		if( b < a ) 
			min = b;
		if( c < a )
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("b값 입력 : ");
		int b = sc.nextInt(); 
		
		System.out.print("c값 입력 : ");
		int c = sc.nextInt(); 
		
		int min = min3(a,b,c);
		System.out.println("최솟값은 : " + min);
	}

}

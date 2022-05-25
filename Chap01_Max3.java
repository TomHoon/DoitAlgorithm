package Algorithm;

import java.util.Scanner;
//최대값 구하기
public class Chap01_Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		
		if(b>a)
			max = b;
		
		if(c>a)
			max = c;
		
		System.out.println("최대값은 : " + max);
	}

}

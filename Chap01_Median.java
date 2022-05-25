package Algorithm;

import java.util.Scanner;

//중앙값 찾기
public class Chap01_Median {
	static int md3(int a, int b, int c){
		int median = a;
		
		if(a>b){
			if(b>c)
				median = b;
			else 		
				median = c;
		}else if(b>a){
			if(a>c)
				median = a;
			else
				median = b;
		}else if(c>a){
			if(b>a)
				median = b;
			else
				median = a;
		}
		
		return median;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("a를 입력하세요 : ");
		int b = sc.nextInt();

		System.out.print("a를 입력하세요 : ");
		int c = sc.nextInt();
		
		int median = md3(a,b,c);
		System.out.println("중앙값은 : " + median);
	}
}

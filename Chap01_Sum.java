package Algorithm;

import java.util.Scanner;

//N까지의 합을 모두 출력하기
public class Chap01_Sum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 까지의 합을 구하실 겁니까? : ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i!=n+1){
			sum += i;
			i++;
			
		}
	}
}

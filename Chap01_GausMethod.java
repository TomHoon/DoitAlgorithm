package Algorithm;

import java.util.Scanner;

//가우스 덧셈법을 이용한 N까지의 총합
public class Chap01_GausMethod {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇까지의 총합을 구하실겁니까? : ");
		int n = sc. nextInt();
		
		int j = 1;
		int sum = 0;
		
		while(j != n/2){
			for(int i=n; i<= n/2+1; i--){
				sum = i + j;
				j++;
			}
		}
		System.out.println("1부터 "+n+"까지의 합은 : " + sum);
	}
}

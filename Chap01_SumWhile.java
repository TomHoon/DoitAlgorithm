package Algorithm;

import java.util.Scanner;

//1부터 N까지의 합계
public class Chap01_SumWhile {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇까지 합계를 구하시겠습니까 ? : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i!=n+1){
			sum += i;
			i++;
		}
		System.out.println(n+"까지의 합계는 " + sum + " 입니다.");
	}
}

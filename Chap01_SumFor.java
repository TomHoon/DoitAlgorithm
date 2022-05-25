package Algorithm;

import java.util.Scanner;

//1부터 N까지 총합계
public class Chap01_SumFor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 N까지의 합계를 구합니다.");
		System.out.print("몇 까지의 합을 구하시겠습니까 ? : ");
		int n = sc.nextInt();

		int sum = 0;
		
		for(int i=1; i<=n; i++){
			sum+=i;
		}
		
		System.out.println("1부터 N까지의 합은 : " + sum +" 입니다.");
	}
}

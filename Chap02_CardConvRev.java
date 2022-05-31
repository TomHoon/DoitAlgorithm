package Algorithm;

import java.util.Scanner;

//정수,진법,배열을 인자로 넣었을 때
//자릿수를 반환하는 메소드
public class Chap02_CardConvRev {
	static int cardConvR(int x, int r, char[] arr){
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do{
			arr[digits++] = dchar.charAt(x%r);
			x = x/r;
			
		}while(x != 0);
		
		System.out.println("자릿 수는 " + digits + "입니다.");
		return digits;
	}
	
	//10진수를 기수 변환합니다.
	//변환하는 음이 아닌 정수 : 
	//어떤 진수로 변환할까요?(2~36) : 2
	//2진수로는 11011입니다.
	//한번 더 할까요?(1.예/2.아니요) : 0
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x; 		//사용자가 입력할 정수
		int r;		//사용자가 입력할 진법
		int answer = 0;	//사용자가 입력할 재시작 유무
		char[] arr = new char[32]; //입력한 정수를 원하는 진법으로 변경 후 담을 배열
		
		do{
			do{
				System.out.print("변환하는 음이 아닌 정수 : ");
				x = sc.nextInt();
			}while(x < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36) : ");
				r = sc.nextInt();
			} while (r < 2 || r > 36);
			
			cardConvR(x,r,arr);
			
			System.out.print("한번 더 할까요 ? (1.예/2.아니요) : ");
			answer = sc.nextInt();
		}while(answer==1);		
		
		System.out.println(">>>종료하겠습니다.<<<");
	}
}

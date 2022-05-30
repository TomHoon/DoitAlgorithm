package Algorithm;

import java.util.Scanner;

//배열을 역정렬하기.
public class Chap02_ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개짜리 정렬을 만드실 겁니까? : ");
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		System.out.println("순서대로 넣어 주십시오. ");
		for(int i=0; i<arr.length; i++){
			System.out.print("arr["+(i+1)+"]"+"에 들어갈 데이터 : ");
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		
		for(int i=0; i<Math.ceil(count/2); i++){
			int back = count-(i+1);
			
			temp = arr[i];
			arr[i] = arr[back];
			arr[back] = temp;
		}
		
		System.out.println(">>>역 정렬된 행렬을 출력하겠습니다.");
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
	}

}

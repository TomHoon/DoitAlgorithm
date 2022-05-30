package Algorithm;

import java.util.Random;
import java.util.Scanner;

//난수 값을 이용하여 특정 반의 장신을 알아내기
public class Chap02_MaxOfArrayRand {
	
	public static int max(int[] arr){
		int max = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max)
				max = arr[i];
		}
		return max; 
	}
	
	public static void main(String[] args){
		Random rm = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수는 몇 명인가요?");
		int num = sc.nextInt();
		
		int[] arr = null;
		
		for(int i=0; i<num; i++){
			arr = new int[num];
			arr[i] = 100 + rm.nextInt(90);
			System.out.println(arr[i]);
		}
		System.out.println("최고의 키는 : " + max(arr));
		
	}
}

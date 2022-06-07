package Algorithm_Chap03;

import java.util.Scanner;

//for문으로 배열에서 선형검색을 통해 값 찾기
public class Chap03_seqSearchFor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 길이 : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++){
			System.out.print((i+1) + "번째 : ");
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		System.out.print("찾을 값 : ");
		int findNum = sc.nextInt();
		
		int index = seqSearchFor(arr, length, findNum);
		System.out.println((index+1)+"번째에 있습니다.");
	}

	private static int seqSearchFor(int[] arr, int length, int findNum) {
		for(int i=0; i<length; i++){
			if(arr[i]==findNum)
				return i;
		}
		return -1;
	}
}

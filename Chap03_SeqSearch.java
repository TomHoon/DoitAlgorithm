package Algorithm_Chap03;

import java.util.Scanner;
//선형 검색으로 배열 값 찾기
public class Chap03_SeqSearch {
	
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소의 갯수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++){
			System.out.print((i+1) + "번째 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("찾을 값 : ");
		int findNum = sc.nextInt();
		
		int index = seqSearch(arr, num, findNum);
		
		if(index == -1)
			System.out.println("찾는 값이 없습니다.");
		else
			System.out.println("찾는 값은 " + (index+1) + "번째에 있습니다.");
	}

	private static int seqSearch(int[] arr, int num, int findNum) {
		int i = 0;
		
		while(true){
			if(i==num)
				return -1;
			
			if(arr[i]==findNum)
				return i;
			
			i++;
		}
	}
}

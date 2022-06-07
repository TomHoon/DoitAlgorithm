package Algorithm_Chap03;

import java.util.Scanner;

//sentinel method 보초법
public class Chap03_SeqSearchSen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("요소 길이 : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length+1];
		
		for(int i=0; i<length; i++){
			System.out.print((i+1)+"번째: ");
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		System.out.print("찾는 값 : ");
		int findNum = sc.nextInt();
		
		int index = seqSearchSen(arr, length, findNum);
		
		if(index==-1)
			System.out.println("찾는 값이 없습니다.");
		else
			System.out.println((index+1)+"번째에 있습니다.");
		
		
	}

	private static int seqSearchSen(int[] arr, int length, int findNum) {
		arr[length] = findNum;
		int i = 0;
		
		for(i=0; i<length; i++){
			if(arr[i]==findNum)
				return i;
		}
		return i ==(length)?-1:i;
	}
}

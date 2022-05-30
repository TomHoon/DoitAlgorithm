package Algorithm;

import java.util.Scanner;

//여러배열 처리 : 두 배열이 같은가
public class Chap02_ArrayEqual {
	
	static boolean IsSame(int[] arr1, int[] arr2){

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0; i<arr1.length; i++){
			sb1.append(arr1[i]);
			sb2.append(arr2[i]);
		}
		
		if(arr1.length == arr2.length){
			if(sb1.toString().equals(sb2.toString())){
				System.out.println("서로 같습니다.");
				return true;
			}else{
				System.out.println("서로 같지 않습니다.");
				return false;
			}
		} else {
			System.out.println("배열의 길이가 같지 않습니다.");
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("배열1 요소 갯수 입력 : ");
		
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		
		for(int i=0; i<num1; i++){
			System.out.print("arr["+(i+1)+"] :");
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("배열2 요소 갯수 입력 : ");
		
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		
		for(int i=0; i<num2; i++){
			System.out.print("arr["+(i+1)+"] :");
			arr2[i] = sc.nextInt();
		}
		
		IsSame(arr1, arr2);
		
	}
}

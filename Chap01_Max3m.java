package Algorithm;

import java.util.Scanner;

 class Chap01_Max3m {
	 static int max3(int a, int b, int c){
		int max = a;
		
		if( b > a )
			max = b;
		
		if( c > a )
			max = c;
		
		return max;
	 }
	 
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 System.out.println("max 값은 : " + max3(a,b,c));
	 }
}

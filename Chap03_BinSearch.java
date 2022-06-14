package Algorithm_Chap03;

public class Chap03_BinSearch {
	
	//인덱스 값을 반환합니다.
	static int binSearch(int[] a, int n, int key){
		int first = 0;
		int last = n-1;
		
		do{
			int center = (first+last)/2;
			
			if(a[center]==key)
				return center;
			else if(a[center]<key)
				first = a[center];
			else if(a[center]>key)
				last = a[center];
		}while(first!=last);
		
		return -1;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		int result = binSearch(a,a.length,2);
		System.out.println("원하는 값은 " +result +"이고 인덱스에 존재하고 인덱스 데이터 값은 : "+ a[result]);
		
	}
}

package Algorithm;

//1000이하 양의 정수의 소수 찾기
public class Chap02_PrimeNumber1 {
	
	public static void main(String[] args){
		int j;
		int i;
		
		for(i=4; i<1000; i++){
			for(j=2; j<i-1; j++){
				if((i%j) == 0){
					System.out.println(i + "는 소수가 아닙니다.");
					break;
			}
			}
			if((i%j) != 0)
				System.out.println("★" + i + "는 소수입니다.");
		}
		
	
	}
}

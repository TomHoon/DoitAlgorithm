package Algorithm;

public class Chap02_PhysicalExamination {
	static final int VMAX = 21;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] pd){
		int average;
		int total = 0;
		for(int i=0; i<pd.length; i++){
			total+=pd[i].height;
		}
		average = total/pd.length;
		
		return average;
	}
	
	static void distVision(PhyscData[] pd, int[] dist){
		for(int i=0; i<pd.length; i++){
			dist[(int)(pd[i].vision*10)]++;	//최대 시력 2.0이라고 가정했을 때 dist배열은 20까지 늘여놔야함.
		}
	}
	
	public static void main(String[] args){
		PhyscData[] pd = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8)
		};
		int[] vdist = new int[VMAX];
		System.out.println("■ 신체 검사 리스트 ■");
		System.out.println("이름         키          시력");
		System.out.println("─────────────────");
		for(int i=0; i<pd.length; i++){
			System.out.printf("%-8s%3d%5.1f\n",pd[i].name,pd[i].height,pd[i].vision);
		}
		System.out.println("평균 키 : " + aveHeight(pd));
		distVision(pd, vdist);
		
		System.out.println("");
		
		System.out.println("시력 분포");
		for(int i=0; i<VMAX; i++){
			System.out.printf("%.1f~ : %d명\n",((i+1)*0.1),vdist[i]);
		}
		
	}
}

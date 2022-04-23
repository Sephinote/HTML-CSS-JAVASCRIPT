import java.lang.invoke.ConstantCallSite;
import java.util.Random;

//구구단의 일부분을 다음과 같이 출력하세요
public class prt {
	public static void main(String[] args) {
		final int gugudan = 8;
		
		
		for (int i = 2; i <= gugudan; i+=3) 
		{
			int twoLine = i + 1;
			int threeLine = i + 2;
			for (int j = 1; j <= 3; j++) 
			{
				if(i != gugudan){
					System.out.printf("%d*%d=%d %d*%d=%d %d*%d=%d", i, j, i * j, twoLine, j, twoLine * j, threeLine, j, threeLine * j);
					System.out.println();
				}else {
					System.out.printf("%d*%d=%d %d*%d=%d", i, j, i * j, i+1, j, (i+1) * j);
					System.out.println();
				}
			}
			
		}
	}
}
//2*1=2 3*1=3 4*1=4
//2*2=4 3*2=6 4*2=8
//2*3=6 3*3=9 4*3=12

//5*1=5 6*1=6 7*1=7
//5*2=10 6*2=12 7*2=14
//5*3=15 6*3=18 7*3=21

//8*1=8 9*1=9
//8*2=16 9*2=18
//8*3=24 9*3=27

//project end
//branch2 test


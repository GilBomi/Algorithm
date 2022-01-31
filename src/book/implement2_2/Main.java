// 왕실의 나이트
package book.implement2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String locate=reader.readLine();
		int y=locate.charAt(1)-'1'; // 행
		int x=locate.charAt(0)-'a'; // 열
		
		int result=0;
		int[] xx= {-2,-2,2,-2,1,1,-1,-1};
		int[] yy= {-1,1,-1,1,-2,2,-2,2};
		for(int i=0;i<8;i++) {
			int desti_x=x+xx[i];
			int desti_y=y+yy[i];
			if(desti_x<8 && desti_x>=0 && desti_y>-8 && desti_y<=0)
				result++;
		}
		System.out.println(result);
    }
}

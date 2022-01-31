// 게임 개발
// 다시 풀기
package book.implement2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static String[][] map;
	public static int[] x4= {0,1,0,-1}; // 북,동,남,서
	public static int[] y4= {-1,0,1,0};
	public static int d;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] a=reader.readLine().split(" ");
		int n=Integer.parseInt(a[0]); // 행
		int m=Integer.parseInt(a[1]); // 열
		map=new String[n][m];
		
		String[] b=reader.readLine().split(" ");
		int y=Integer.parseInt(b[0]);
		int x=Integer.parseInt(b[1]);
		d=Integer.parseInt(b[2]);
		String w=b[2];
		
		for(int i=0;i<n;i++) {
			map[n]=reader.readLine().split(" ");
		}
		int result=0;
		while(true) {
			turnLeft();
			int xx=x+x4[d];
			int yy=y+y4[d];
			if(map[xx][yy].equals(0)) { // 방문하지 않았을떄
				
			}
				
		}
		
		
    }
	public static void turnLeft() {
		d--;
		if(d==-1)
			d=3;
	}
}

package baekjoon.no11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class 좌표 implements Comparable<좌표>{
		int x;
		int y;
		public 좌표(int x,int y) {
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(좌표 p) {
			// TODO Auto-generated method stub
			if(this.x!=p.x)
				return this.x-p.x;
			return this.y-p.y;
		}
		@Override
		public String toString() {
			return x+" "+y;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		좌표[] 좌표=new 좌표[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int x=Integer.parseInt(token.nextToken());
			int y=Integer.parseInt(token.nextToken());
			좌표[i]=new 좌표(x,y);
		}
		Arrays.sort(좌표);
		for(좌표 i:좌표) {
			System.out.println(i);
		}
	}
}

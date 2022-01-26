package baekjoon.no2476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

public class Main {
	public static int 최대값(int m1,int m2,int m3) {
		if(m1<m2) {
			if(m2<m3)
				return m3;
			else
				return m2;
		}else {
			if(m1>m3)
				return m1;
			else
				return m3;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int max=0;
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken());
			int m2=Integer.parseInt(token.nextToken());
			int m3=Integer.parseInt(token.nextToken());

			if(m1==m2 && m1==m3) { 
				if(max<10000+m1*1000)
					max=10000+m1*1000;
			} else if(m1==m2 && m1!=m3)	{
				if(max<1000+m1*100)
					max=1000+m1*100;
			}else if(m1==m3 && m1!=m2) {
				if(max<1000+m1*100)
					max=1000+m1*100;
			}else if(m2==m3 && m1!=m2) {
				if(max<1000+m2*100)
					max=1000+m2*100;
			} else {
				int 세개중최대값=최대값(m1,m2,m3);
				if(max<100*세개중최대값)
					max=100*세개중최대값;
			}
		}
		System.out.println(max);


	}
}

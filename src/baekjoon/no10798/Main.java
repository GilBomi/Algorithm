package baekjoon.no10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		char[][] a=new char[5][15];
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<5;i++) {
			String s=reader.readLine();
			for(int j=0;j<s.length();j++) {
				a[i][j]=s.charAt(j);
			}
				
		}
//		for(int i=0;i<15;i++) {
//			System.out.print(a[0][i]);
//		}
//		System.out.println("!");
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(a[j][i]!=0)
					sb.append(a[j][i]);
			}
		}
		System.out.println(sb.toString());
	}
}

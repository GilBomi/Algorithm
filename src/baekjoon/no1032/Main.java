package baekjoon.no1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		String[] a=new String[n];
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<n;i++) {
			a[i]=reader.readLine();
		}
		for(int i=0;i<a[0].length();i++) {
			boolean b=true;
			for(int k=1;k<n;k++) {
				if(a[k].charAt(i)!=a[0].charAt(i)) {
					b=false;
					break;
				}
			}
			sb.append(b?a[0].charAt(i):"?");
		}
		System.out.println(sb.toString());
	}
}

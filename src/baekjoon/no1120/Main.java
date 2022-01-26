package baekjoon.no1120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s=reader.readLine().split(" ");
		String A=s[0];
		String B=s[1];
		int diff=B.length()-A.length();
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<=diff;i++) {
			int n=0;
			String A2=B.substring(0,i)+A+B.substring(B.length()-diff+i,B.length());
			for(int j=0;j<B.length();j++) {
				if(A2.charAt(j)!=B.charAt(j))
					n++;
			}
			if(min>=n)
				min=n;
		}
		System.out.println(min);
	}
}

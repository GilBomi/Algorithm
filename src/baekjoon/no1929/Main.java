package baekjoon.no1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());

		boolean[] result=new boolean[m+1];
		Arrays.fill(result,true);
		for(int i=0;i<n;i++) {
			result[i]=false;
		}
		result[0]=false;
		result[1]=false;
		for(int i=2;m>=i*i;i++) {
			for(int j=2;m>=j*i;j++) {
				result[i*j]=false;
			}
		}
		for(int i=n;i<=m;i++) {
			if(result[i])
				System.out.println(i);
		}
	}
}

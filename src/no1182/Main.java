package no1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] array;
	static int s;
	
	static int brute(int index,int sum) {
		if(sum==s)
			return 1;
		int r1=brute(index+1,sum);
		int r2=brute(index+1,sum+array[index]);
		return r1+r2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		s=Integer.parseInt(token.nextToken());
		token=new StringTokenizer(reader.readLine());
		array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=Integer.parseInt(token.nextToken());
		}
		System.out.println(brute(0,0));
	}
}

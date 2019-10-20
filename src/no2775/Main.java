package no2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(reader.readLine());
		int k=0,n=0;
		for(int i=0;i<num;i++) {
			k=Integer.parseInt(reader.readLine());
			n=Integer.parseInt(reader.readLine());
			System.out.println(manNum(k,n));
		}
	}
	public static int manNum(int k,int n) {
		if(n==0)
			return 0;
		else if(k==0) 
			return n;
		else
			return manNum(k,n-1)+manNum(k-1,n);
	}
}

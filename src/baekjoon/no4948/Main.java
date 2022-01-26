package baekjoon.no4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n=Integer.parseInt(reader.readLine());
			if(n==0)
				return;
			System.out.println(소수의_수(n));
		}
	}
	public static int 소수의_수(int n) {
		boolean[] result=new boolean[2*n+1];
		Arrays.fill(result,true);
		for(int i=0;i<n;i++) {
			result[i]=false;
		}
		result[0]=false;
		result[1]=false;
		for(int i=2;2*n>=i*i;i++) {
			for(int j=2;2*n>=i*j;j++) {
				if(result[i*j])
					result[i*j]=false;
			}
		}
		int num=0;
		for(int i=n+1;i<=n*2;i++) {
			if(result[i])
				num++;
		}
		return num;
		
	}
}

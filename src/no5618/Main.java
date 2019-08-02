package no5618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int[] array=new int[n];
		if(n==2) {
			array[0]=Integer.parseInt(token.nextToken());
			array[1]=Integer.parseInt(token.nextToken());
		} else if(n==3) {
			array[0]=Integer.parseInt(token.nextToken());
			array[1]=Integer.parseInt(token.nextToken());
			array[2]=Integer.parseInt(token.nextToken());
		}
		int k=공약수(array);
		for(int i=1;i<=k;i++) {
			if(k%i==0)
				System.out.println(i);
		}
	}
	public static int 공약수(int[] array) {
		long a=array[0];
		long b=array[1];
		while(b!=0) {
			long t=a%b;
			a=b;
			b=t;
		}
		long result=a;
		
		if(array.length==3) {
			long c=array[2];
			while(c!=0) {
				long t=result%c;
				result=c;
				c=t;
			}
			return (int)result;
		}
		return (int)result;
	}
}

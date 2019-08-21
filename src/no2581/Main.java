package no2581;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int m=Integer.parseInt(reader.readLine());
		boolean[] result=new boolean[m+1];
		Arrays.fill(result, true);
		for(int i=0;i<n;i++) {
			result[i]=false;
		}
		result[0]=false;
		result[1]=false;
		for(int i=2;m>=i*i;i++) {
			for(int j=2;m>=j*i;j++) {
				result[j*i]=false;
			}
		}
		int sum=0;
		int min=0;
		boolean minBool=false;
		for(int i=n;i<=m;i++) {
			if(!minBool && result[i]) {
				min=i;
				minBool=true;
			}
			if(result[i]) 
				sum+=i;
		}
		if(sum==0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

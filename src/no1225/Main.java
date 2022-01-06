package no1225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] a=reader.readLine().split(" ");
		long sum=0;
		for(int i=0;i<a[0].length();i++) {
			for(int j=0;j<a[1].length();j++) {
				sum+=Long.parseLong(a[0].substring(i,i+1))*Long.parseLong(a[1].substring(j,j+1));
			
			}
		}
		System.out.println(sum);
		
	}
}

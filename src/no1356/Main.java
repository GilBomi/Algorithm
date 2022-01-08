package no1356;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		char[] a=reader.readLine().toCharArray();
		
		String result="NO";
		for(int i=0;i<a.length-1;i++) {
			int sum1=1,sum2=1;
			for(int p=0;p<=i;p++) {
				sum1*=a[p]-'0';
			}
			for(int q=i+1;q<a.length;q++) {
				sum2*=a[q]-'0';
			}
			if(sum1==sum2) {
				result="YES";
				break;
			}
		}
		System.out.println(result);
	}
}

package no1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		char[] a=reader.readLine().toCharArray();
		
		int num_zero=0,num_one=0;
		char prev=a[0];
		if(prev=='0')
			num_zero++;
		else
			num_one++;
		for(int i=0;i<a.length;i++) {
			if(prev!=a[i]) {
				if(a[i]=='0') {
					num_zero++;
				} else {
					num_one++;
				}
				prev=a[i];
			}
		}
		System.out.println(Math.min(num_zero, num_one));
	}
}

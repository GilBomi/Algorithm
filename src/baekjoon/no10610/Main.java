package baekjoon.no10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		boolean b=false;
		int sum=0;
		Integer[] a=new Integer[s.length()];
		
		for(int i=0;i<s.length();i++) {
			char k=s.charAt(i);
			if(k=='0')
				b=true;
			sum+=k-'0';
			a[i]=k-'0';
		}
		
		if(b && sum%3==0) {
			Arrays.sort(a,Collections.reverseOrder());
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<a.length;i++) {
				sb.append(a[i]);
			}
			System.out.println(sb.toString());
			return;
		}
		System.out.println(-1);
		
	}
}

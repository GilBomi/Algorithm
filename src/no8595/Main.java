package no8595;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		long sum=0;
		String num="";
		
		for(int i=0;i<n;i++) {
			int a=reader.read()-'0';
			if((a>=0) && (a<10)) {
				num+=a;
			} else {
				if(num.length()!=0) {
					sum+=long.parseLong(num);
					num="";
				}
			}
		}
		if(num.length()!=0)
			sum+=Integer.parseInt(num);
		System.out.println(sum);
	
	}
}

package no9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(n-- >0) {
			String[] s=reader.readLine().split(" ");
			for(int i=0;i<s.length;i++) {
				char[] a=s[i].toCharArray();
				for(int k=a.length-1;k>=0;k--) {
					sb.append(a[k]);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}

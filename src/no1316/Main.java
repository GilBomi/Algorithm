package no1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		String[] a=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=reader.readLine();
		}
		int result=0;
		
		for(int i=0;i<n;i++) {
			int[] alpha=new int[26];
			char p='A';
			int k=0;
			for(k=0;k<a[i].length();k++) {
				if(alpha[a[i].charAt(k)-'a']!=0) {
					if(p!=a[i].charAt(k))
						break;
				}
				alpha[a[i].charAt(k)-'a']=1;
				p=a[i].charAt(k);
			}
			if(k==a[i].length())
				result++;
		}

		System.out.println(result);
	}
}

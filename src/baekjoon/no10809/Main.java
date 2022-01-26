package baekjoon.no10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		char[] ca=reader.readLine().toCharArray();
		int[] a=new int[26];
		Arrays.fill(a, -1);
		
		for(int i=0;i<ca.length;i++) {
			if(a[ca[i]-'a']==-1) {
				a[ca[i]-'a']=i;
			}
		}
		for(int i=0;i<26;i++) 
			System.out.print(a[i]+" ");
	}
}

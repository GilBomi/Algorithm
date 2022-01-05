package no1357;

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
		String[] s=reader.readLine().split(" ");
		
		int rev1=rev(s[0]);
		int rev2=rev(s[1]);
		
		System.out.println(rev(String.valueOf(rev1+rev2)));
	}
	public static int rev(String s) {
		char[] a=s.toCharArray();
		int num=0;
		for(int i=0;i<a.length;i++) {
			num+=Integer.parseInt(String.valueOf(a[i]))*Math.pow(10,i);
		}
		return num;
	}
}

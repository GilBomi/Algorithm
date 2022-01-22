package no1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String a=reader.readLine();
		String s=reader.readLine();
		
		int sum=0;
		int i=0;
		while(i<a.length()) {
			int p=a.indexOf(s,i);
			if(p==-1)
				break;
			i=p+s.length();
			sum++;
		}
		System.out.println(sum);
	}
}

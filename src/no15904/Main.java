package no15904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] a=reader.readLine().toCharArray();
		char[] ucpc= {'U','C','P','C'};
		
		int idx=0;
		for(int i=0;i<a.length;i++) {
			if(idx>3)
				break;
			if(a[i]==ucpc[idx])
				idx++;
		}
		System.out.println(idx==4?"I love UCPC":"I hate UCPC");
	}
}

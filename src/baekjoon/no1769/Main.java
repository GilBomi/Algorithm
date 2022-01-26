package baekjoon.no1769;

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
	private static int n=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] a=reader.readLine().toCharArray();
		
		int Y=배수_3의(a);
		System.out.println(n);
		System.out.println(Y%3==0?"YES":"NO");
	}
	public static int 배수_3의(char[] a) {
		if(a.length==1)
			return a[0]-'0';
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i]-'0';
		}
		n++;
		return 배수_3의(String.valueOf(sum).toCharArray());
		
	}
}

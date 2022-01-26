package baekjoon.no14405;

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
		boolean b=true;
		for(int i=0;i<a.length;i++) {
			switch(a[i]) {
			case 'p':
				if(i+1<a.length && a[i+1]=='i') {
					i=i+1;
				} else {
					b=false;
				}
				break;
			case 'k':
				if(i+1<a.length && a[i+1]=='a') {
					i=i+1;
				} else {
					b=false;
				}
				break;
			case 'c':
				if(i+2<a.length && a[i+1]=='h' && a[i+2]=='u') {
					i=i+2;
				} else {
					b=false;
				}
				break;
			default:
				b=false;
				break;
			}
		}
		System.out.println(b?"YES":"NO");
		
	}
}

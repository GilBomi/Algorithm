package baekjoon.no1755;

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
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s=reader.readLine().split(" ");
		String M=s[0]; // 8
		String N=s[1]; // "28"
		String[] alpha= {"zero","one","two","three","four","five","six","seven",
				"eight","nine"};
		String[] result=new String[Integer.parseInt(N)-Integer.parseInt(M)+1];
		
		int j=0;
		for(int i=Integer.parseInt(M);i<=Integer.parseInt(N);i++) {
			if(i/10>=1) { // i가 10~99일떄
				String r="";
				for(int k=0;k<2;k++) {
					
				}
				result[j++]=r;
			} else { // 1~9일때
				result[j++]=alpha[i];
			}
		}
		
	}
}

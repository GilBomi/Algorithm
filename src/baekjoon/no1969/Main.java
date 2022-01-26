package baekjoon.no1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s=reader.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int M=Integer.parseInt(s[1]);
		String[] a=new String[N];
		int hd=0;
		StringBuilder sb=new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			a[i] = reader.readLine();
		}
		
		for (int i = 0; i < M; i++) {
			int[] cnt = new int[4]; // A C G T
			for (int j = 0; j < N; j++) {
				switch (a[j].charAt(i)) {
				case 'A':
					cnt[0]++;
					break;
				case 'C':
					cnt[1]++;
					break;
				case 'G':
					cnt[2]++;
					break;
				case 'T':
					cnt[3]++;
					break;
				}
			}
			
			int max_index=0;
			int max_value=0;
			for(int j=0;j<4;j++) {
				if(cnt[max_index]<cnt[j]) {
					max_index=j;
					max_value=cnt[j];
				}
			}
			if(max_index==0)
				max_value=cnt[0];
			hd+=(N-max_value);
			switch(max_index) {
			case 0:
				sb.append("A");
				break;
			case 1:
				sb.append("C");
				break;
			case 2:
				sb.append("G");
				break;
			case 3:
				sb.append("T");
				break;
			}
		}
		
		System.out.println(sb.toString());
		System.out.println(hd);
	}
}

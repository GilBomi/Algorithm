package baekjoon.no1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			System.out.println(최소공배수(a,b));
		}

	}
	public static long 최대공약수(long a,long b) {
		while(b!=0) {
			long t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	public static long 최소공배수(long a,long b) {
		return a*b/최대공약수(a,b);
	}
}

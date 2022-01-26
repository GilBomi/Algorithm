package baekjoon.no1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int a=Integer.parseInt(token.nextToken());
		int b=Integer.parseInt(token.nextToken());
		System.out.println(a+b);
		
	}
}

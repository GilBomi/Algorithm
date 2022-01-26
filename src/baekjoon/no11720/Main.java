package baekjoon.no11720;

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
		int n=Integer.parseInt(reader.readLine());
		String ns=reader.readLine();
		int sum=0;
		
		for(int i=0;i<(n<=100?n:100);i++) {
			sum+=Integer.parseInt(ns.substring(i,i+1));
		}
		System.out.println(sum);
	}
}

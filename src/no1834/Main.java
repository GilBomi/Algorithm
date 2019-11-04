package no1834;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		//ArrayList<Integer> list=new ArrayList<>();
		long sum=0;
		for(int i=1;i<n;i++) {
			//list.add(i*(n+1));
			sum+=(long)i*(n+1);
		}
		System.out.println(sum);
		
	}
}

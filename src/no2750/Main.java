package no2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			int m=Integer.parseInt(reader.readLine());
			array[i]=m;
		}
		Arrays.sort(array);
		for(int i:array) 
			System.out.println(i);
	}
}

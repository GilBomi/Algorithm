package no1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		String[] array=new String[s.length()];
		for(int i=0;i<array.length;i++) {
			array[i]=s.substring(i,i+1);
		}
		Arrays.sort(array,(s1,s2)->{return s2.compareTo(s1);});
		for(String i:array) {
			System.out.print(i);
		}
	}
}

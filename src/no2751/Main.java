package no2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int m=Integer.parseInt(reader.readLine());
			list.add(m);
		}
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
	}
}

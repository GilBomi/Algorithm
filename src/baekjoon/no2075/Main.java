package baekjoon.no2075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			for(int j=0;j<n;j++) {
				int m=Integer.parseInt(token.nextToken());
				list.add(m);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(n*n-n));
		
		
		
	}
}

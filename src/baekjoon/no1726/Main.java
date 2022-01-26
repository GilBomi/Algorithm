package baekjoon.no1726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s=reader.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int M=Integer.parseInt(s[1]);
		Set<String> ns=new HashSet();
		List<String> list=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			ns.add(reader.readLine());
		}
		for(int i=0;i<M;i++) {
			String m=reader.readLine();
			if(ns.contains(m))
				list.add(m);
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		
	}
}

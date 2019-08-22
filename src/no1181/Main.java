package no1181;

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
		List<String> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String s=reader.readLine();
			if(!list.contains(s))
				list.add(s);
		}
		Collections.sort(list, (s1,s2)-> {
			if(s1.length()!=s2.length())
				return s1.length()-s2.length();
			return s1.compareTo(s2);
		});
		for(String i:list) {
			System.out.println(i);
		}
	}
}

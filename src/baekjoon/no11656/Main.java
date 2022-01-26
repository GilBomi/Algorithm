package baekjoon.no11656;

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
		String s=reader.readLine();
		List<String> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.substring(i,s.length()));
		}
		Collections.sort(list);
		for(int i=0;i<s.length();i++)
			System.out.println(list.get(i));
	}
}

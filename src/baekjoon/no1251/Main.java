package baekjoon.no1251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.xml.stream.events.Characters;

public class Main {
	private static List<String> list=new ArrayList();
	private static String s;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		s=reader.readLine();
		
		splitArray();
		Collections.sort(list);
		System.out.println(list.get(0));
	}
	public static void splitArray() {
		for(int i=0;i<s.length()-2;i++) {
			for(int j=i+1;j<s.length()-1;j++) {
				String a1=new StringBuffer(s.substring(0,i+1)).reverse().toString();
				String a2=new StringBuffer(s.substring(i+1,j+1)).reverse().toString();
				String a3=new StringBuffer(s.substring(j+1,s.length())).reverse().toString();
				list.add(a1+a2+a3);
			}
		}
	}
}

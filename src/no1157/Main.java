package no1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		s=s.toUpperCase();
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String max_string=null;
		int max_value=0;
		
		for(int i=0;i<s.length();i++) {
			String a=s.substring(i,i+1);
			map.put(a,map.get(a)==null?1:map.get(a)+1);
			if(max_value<map.get(a)) {
				max_string=a;
				max_value=map.get(a);
			} else if((!max_string.equals(a))&& (max_value==map.get(a))) {
				max_string="?";
			}
		}
		System.out.println(max_string);
		
	}

}

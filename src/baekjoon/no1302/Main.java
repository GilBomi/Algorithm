package baekjoon.no1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		Map<String,Integer> map=new HashMap<>();
		
		while(n -->0) {
			String s=reader.readLine();
			if(map.get(s)==null)
				map.put(s,1);
			else
				map.put(s,map.get(s)+1);
		}
		List<String> listKeySet = new ArrayList<>(map.keySet());
		String max_key="";
		int max_value=0;
		for(String key:listKeySet) {
			if(map.get(key)>max_value) {
				max_value=map.get(key);
				max_key=key;
			} else if(map.get(key)==max_value) {
				if(max_key.compareTo(key)>0) {
					max_key=key;
				}
			}
		}
		System.out.println(max_key);
		Set<Integer> map1=new HashSet();
		map1.contains(1);
		
	}
}


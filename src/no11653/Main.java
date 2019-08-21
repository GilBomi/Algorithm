package no11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		List<Integer> 소수리스트=소수(n);
		List<Integer> result=new ArrayList<>();
		result=소인수분해(n,소수리스트,new ArrayList<>());
		Collections.sort(result);
		for(int i:result) {
			System.out.println(i);
		}
	}
	public static List<Integer> 소수(int n) {
		boolean[] result=new boolean[n+1];
		Arrays.fill(result, true);
		result[0]=false;
		result[1]=false;
		for(int i=2;n>=i*i;i++) {
			for(int j=2;n>=j*i;j++) {
				if(result[i*j])
					result[i*j]=false;
			}
		}
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n+1;i++) {
			if(result[i])
				list.add(i);
		}
		return list;
	}
	public static List<Integer> 소인수분해(int n,List<Integer> list,List<Integer> result) {
		for(int i=0;i<list.size();i++) {
			if(n==list.get(i)) {
				result.add(n);
				return result;
			}
			if(n%list.get(i)==0) {
				result.add(list.get(i));
				return 소인수분해(n/list.get(i),list,result);
			}
		}
		return result;
		
	}
}

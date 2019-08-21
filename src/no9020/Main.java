package no9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		for(int i=0;i<n;i++) {
			int m=Integer.parseInt(reader.readLine());
			boolean[] result=소수_구하기(m);
			System.out.println(최소값(m,result));	
		}
	}
	public static boolean[] 소수_구하기(int m) {
		boolean[] result=new boolean[m+1];
		Arrays.fill(result, true);
		result[0]=false;
		result[1]=false;
		for(int i=2;m>=i*i;i++) {
			for(int j=2;m>=j*i;j++) {
				if(result[i*j])
					result[i*j]=false;
			}
		}
		return result;
	}
	public static String 최소값(int m,boolean[] result) {
		int middle=m/2;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<result.length;i++) {
			if(result[i])
				list.add(i);
		}
		if(list.contains(middle)) 
			return middle+" "+middle;
		for(int i=middle;i<m;i++) {
			if(list.contains(i) &&list.contains(m-i)) 
				return m-i+" "+i;
		}
		return "";
	}
}

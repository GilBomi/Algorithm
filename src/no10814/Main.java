package no10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class 회원 implements Comparable<회원>{
		int age;
		String name;
		int order; // 순서
		public 회원(int age,String name,int order) {
			this.age=age;
			this.name=name;
			this.order=order;
		}
		@Override
		public int compareTo(회원 p) {
			if(this.age!=p.age)
				return this.age-p.age;
			return this.order-p.order;
		}
		@Override
		public String toString() {
			return age+" "+name;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		회원[] 회원=new 회원[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int age=Integer.parseInt(token.nextToken());
			String name=token.nextToken();
			회원[i]=new 회원(age,name,i);
		}
		Arrays.sort(회원);
		for(회원 i:회원)
			System.out.println(i);
		
	} 
}

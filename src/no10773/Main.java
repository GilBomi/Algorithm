package no10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int K=Integer.parseInt(reader.readLine());
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<K;i++) {
			int n=Integer.parseInt(reader.readLine());
			if(n==0)
				stack.pop();
			else
				stack.push(n);
		}
		int sum=0;
		for(int i:stack) {
			sum+=i;
		}
		System.out.println(sum);
	}
}

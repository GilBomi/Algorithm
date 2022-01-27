// 곱하기 혹은 더하기
package book.greedy3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s=reader.readLine().split("");
		int sum=0;
		for(int i=0;i<s.length;i++) {
			int n=Integer.parseInt(s[i]);
			if(n<=1 || sum<=1) {
				sum+=n;
			} else {
				sum*=n;
			}
			System.out.println("n:"+n);
		}
		System.out.println(sum);
	}
}

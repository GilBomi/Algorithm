// 럭키 스트레이트
package book.implement3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		//123456-> 6/2=3 -> 0~2,3~5 더하기
		String left=n.substring(0,n.length()/2);
		String right=n.substring(n.length()/2,n.length());
		if(sum(left)==sum(right))
			System.out.println("LUCKY");
		else
			System.out.println("READY");
	}
	public static int sum(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i)-'0';
		}
		return sum;
	}
}

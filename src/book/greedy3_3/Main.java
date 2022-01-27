// 문자열 뒤집기
package book.greedy3_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		char[] s=reader.readLine().toCharArray();
		int pre=s[0]-'0';
		int num0=0,num1=0;
		if(pre==0) {
			num0++;
		} else {
			num1++;
		}
		for(int i=1;i<s.length;i++) {
			if((s[i]-'0')!=pre) {
				if(pre==0) {
					num1++;
					pre=1;
				} else {
					num0++;
					pre=0;
				}
			} 
		}
		System.out.println(Math.min(num0, num1));
	}
}

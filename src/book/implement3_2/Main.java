// 문자열 재정렬
package book.implement3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		char[] n=reader.readLine().toCharArray();
		// 알파벳 대문자 오름차순한 뒤에 모든 숫자를 더한 값을 맨 뒤에 출력
		int sum=0;
		Arrays.sort(n);
		StringBuilder result=new StringBuilder();
		for(int i=0;i<n.length;i++) {
			if(n[i]>=48 && n[i]<=57) {
				sum+=i-'0';
			} else {
				result.append(String.valueOf(n[i]));
			}
		}
		if(sum!=0)
			result.append(sum);
		System.out.println(result.toString());
		
	}
	
}

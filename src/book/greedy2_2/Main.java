// 큰 수의 법칙
package book.greedy2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] sa=reader.readLine().split(" ");
		int N=Integer.parseInt(sa[0]);
		int M=Integer.parseInt(sa[1]);
		int K=Integer.parseInt(sa[2]);
		String[] s=reader.readLine().split(" ");
		Arrays.sort(s);
		int sum=0;
		
		
		while(true) {
			for(int i=0;i<K;i++) {
				if(M==0) {
					System.out.println(sum);
					return;
				}
				sum+=Integer.parseInt(s[s.length-1]);
				M--;
			}
			if(M==0) {
				System.out.println(sum);
				return;
			}	
			sum+=Integer.parseInt(s[s.length-2]);
			M--;
			
		}
	}
}

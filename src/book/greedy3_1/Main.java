// 모험가 길드
package book.greedy3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] a=reader.readLine().split(" ");
		int N=Integer.parseInt(a[0]);
		String[] s=reader.readLine().split(" ");
		int[] 공포도=new int[s.length];
		
		for(int i=0;i<s.length;i++) {
			공포도[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(공포도);
		int 사람수=1;
		int partyNum=0;
		for(int i=0;i<공포도.length;i++) {
			if(공포도[i]==사람수) {
				partyNum++;
				사람수=1;
			} else {
				사람수++;
			}
		}
		System.out.println(partyNum);
	}
}

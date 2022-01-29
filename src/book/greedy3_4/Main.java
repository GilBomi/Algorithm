// 만들 수 없는 금액
package book.greedy3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		String[] a=reader.readLine().split(" ");
		Arrays.sort(a);
		int answer=1;
		for(int i=0;i<a.length;i++) {
			if(answer<Integer.parseInt(a[i]))
				break;
			answer+=Integer.parseInt(a[i]);
		}
		System.out.println(answer);
	}
}

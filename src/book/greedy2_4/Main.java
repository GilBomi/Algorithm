// 1이 될떄까지
package book.greedy2_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] a=reader.readLine().split(" ");
		int N=Integer.parseInt(a[0]);
		int K=Integer.parseInt(a[1]);
		
		int n=0;
		while(N!=1) {
			if(N%K==0) {
				N/=K;
			} else {
				N-=1;
			}
			System.out.println("N:"+N);
			n++;
		}
		System.out.println(n);
		
	}
}

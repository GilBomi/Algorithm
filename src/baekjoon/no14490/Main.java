package baekjoon.no14490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] a=reader.readLine().split(":");
		int n=Integer.parseInt(a[0]);
		int m=Integer.parseInt(a[1]);
		
		while(true) {
			boolean check=false;
			int min=Math.min(m, n);
			for(int i=2;i<=min;i++) {
				if(n%i==0 && m%i==0) {
					n/=i;
					m/=i;
					check=true;
					break;
				}
			}
			if(!check)
				break;
		}
		System.out.println(String.valueOf(n)+":"+String.valueOf(m));
	}
}

package baekjoon.no2839;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		for(int i=n/5;i>=0;i--) {
			for(int j=0;j*3<=n;j++) {
				if(i*5+j*3==n) {
					System.out.println(i+j);
					return;
				}
			}
		}
		System.out.println("-1");
	}
}

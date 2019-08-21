package no5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int n=Integer.parseInt(token.nextToken());
			int m=Integer.parseInt(token.nextToken());
			if(n==0 & m==0)
				return;
			boolean result=false;
			if(n<m) {
				for(int i=2;m>=i*n;i++) {
					if(m==n*i) {
						System.out.println("factor");
						result=true;
						break;
					}
				}			
			}
			else if(n>m) {
				for(int i=2;n>=i*m;i++) {
					if(n==m*i) {
						System.out.println("multiple");
						result=true;
						break;
					}
				}			
			}
			if(!result)
				System.out.println("neither");
		}
		
	}
}

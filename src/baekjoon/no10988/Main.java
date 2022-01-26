package baekjoon.no10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.net.ssl.SSLContext;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int n=1;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				n=0;
				break;
			}
		}
		System.out.println(n);
	}
}

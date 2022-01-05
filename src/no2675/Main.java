package no2675;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<n;i++) {
			String rl=reader.readLine();
			int r=Integer.parseInt(rl.split(" ")[0]);
			String s=rl.split(" ")[1];
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<r;k++) {
					sb.append(s.substring(j,j+1));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}

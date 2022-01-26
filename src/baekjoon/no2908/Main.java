package baekjoon.no2908;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		
		StringBuffer sb1 = new StringBuffer(n.split(" ")[0]);
		String rsb1 = sb1.reverse().toString();
		
		StringBuffer sb2 = new StringBuffer(n.split(" ")[1]);
		String rsb2 = sb2.reverse().toString();
		
		int p=Integer.parseInt(rsb1);
		int q=Integer.parseInt(rsb2);
		System.out.println(p>q?p:q);
		
	}
}

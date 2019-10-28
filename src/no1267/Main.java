package no1267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		
		int M=0,Y=0;
		String s=reader.readLine();
		String[] array=s.split(" ");
		for(int i=0;i<n;i++) {
			int 통화시간=Integer.parseInt(array[i]);
			M+=(통화시간/30+1)*10;
			Y+=(통화시간/60+1)*15;
		}
		if(M<Y) 
			System.out.println("Y "+M);
		else if(M>Y) 
			System.out.println("M "+Y);
		else 
			System.out.print("Y M "+M);
	
	}
}


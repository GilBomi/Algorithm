package baekjoon.no5555;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String find=reader.readLine();
		int N=Integer.parseInt(reader.readLine());
		String[] s=new String[N];
		int sum=0;
		
		for(int i=0;i<N;i++) {
			String k=reader.readLine();
			s[i]=k+k;
			if(s[i].contains(find))
				sum++;
		}
		
		System.out.println(sum);
	}
	
}

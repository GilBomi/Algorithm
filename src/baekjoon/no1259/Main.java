package baekjoon.no1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String result="yes";
			String s=reader.readLine();
			if(s.equals("0"))
				return;

			char[] c=s.toCharArray();
			for(int i=0;i<c.length/2;i++) {
				if(c[i]!=c[c.length-i-1]) {
					result="no";
				}
			}
			System.out.println(result);
		}
	}
}

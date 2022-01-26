package baekjoon.no5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)-'A'<15) {
				switch((s.charAt(i)-'A')/3+2) {
				case 1:
					sum+=2;
					break;
				case 2:
					sum+=3;
					break;
				case 3:
					sum+=4;
					break;
				case 4:
					sum+=5;
					break;
				case 5:
					sum+=6;
					break;
				case 6:
					sum+=7;
					break;
				}
			} else {
				switch(s.charAt(i)) {
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					sum+=8;
					break;
				case 'T':
				case 'U':
				case 'V':
					sum+=9;
					break;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					sum+=10;
					break;
				}
			}
		}
		System.out.println(sum);
		
	}
}

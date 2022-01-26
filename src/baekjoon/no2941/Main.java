package baekjoon.no2941;

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
		String s=reader.readLine();

		String[] cro= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		int i=0;
		while(i<8) {
			if(s.contains(cro[i])) {
				s=s.replace(cro[i], "*");
			} else 
				i++;
		}
		System.out.println(s.length());
	}
}

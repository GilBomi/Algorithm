package no11719;

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
			String n=reader.readLine();
			if(n==null)
				return;
			System.out.println(n);
		}

	}
}

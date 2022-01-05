package no1152;
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
		s=s.trim();
		String[] a=s.split(" ");
		if(a.length==1) {
			if(a[0].equals("")) {
				System.out.println("0");
				return;
			} 
		}
		System.out.println(a.length);
		
	}
}
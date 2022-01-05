package no1652;

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
		int n=Integer.parseInt(reader.readLine());
		String[][] a=new String[n][n];
		for(int i=0;i<n;i++) {
			a[i]=reader.readLine().split("");
		}
		int x=0;
		for(int i=0;i<n;i++) {
			boolean b=false;
			for(int j=0;j<n-1;j++) {
				if(a[i][j].equals("X")) {
					b=false;
				}
				if(a[i][j].equals(".") && a[i][j+1].equals(".")) {
					if(!b) {
						b=true;
						x++;
					}
				}
			}
		}
		int y=0;
		for(int i=0;i<n;i++) {
			boolean b=false;
			for(int j=0;j<n-1;j++) {
				if(a[j][i].equals("X")) {
					b=false;
				}
				if(a[j][i].equals(".") && a[j+1][i].equals(".")) {
					if(!b) {
						b=true;
						y++;
					}
				}
			}
		}
		System.out.println(x+" "+y);
	}
}

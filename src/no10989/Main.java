package no10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int[] array=new int[10001];
		for(int i=0;i<n;i++) {
			int m=Integer.parseInt(reader.readLine());
			array[m]++;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<10001;i++) {
			for(int j=0;j<array[i];j++) {
				bw.write(Integer.toString(i)+"\n");
				
			}
		}
		bw.close();
	}
}

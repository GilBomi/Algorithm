package baekjoon.no1977;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(reader.readLine());
		int M=Integer.parseInt(reader.readLine());
		int N완전제곱근=(int)Math.ceil(Math.sqrt(N));
		int M완전제곱근=(int)Math.floor(Math.sqrt(M));
		int sum=0;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=N완전제곱근;i<=M완전제곱근;i++) {
			list.add(i*i);
			sum+=i*i;
		}
		if(list.isEmpty()) {
			System.out.println("-1");
			return;
		}
		System.out.println(sum);
		System.out.println(list.get(0));
	}
}

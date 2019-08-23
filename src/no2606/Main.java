package no2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<Integer>[] list;
	static boolean[] visited;
	static int num;
	
	public static void dfs(int start) {
		for(int i:list[start]) {
			if(visited[i])
				continue;
			visited[i]=true;
			num++;
			dfs(i);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int m=Integer.parseInt(reader.readLine());
		list=new ArrayList[n];
		num=0;
		visited=new boolean[n];
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++) {
			list[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m1].add(m2);
			list[m2].add(m1);			
		}
		dfs(0);
		System.out.println(num-1);
	}
}

package no1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<Integer>[] list;
	static boolean[] visited;
	static int[] depth;

	public static void dfs(int start) {
		//		visited[start]=true;
		//		for(int i:list[start]) {
		//			if(visited[i])
		//				continue;
		//			System.out.println("깊이:"+i);
		//			dfs(i);
		//		}

		visited[start] = true;
		//System.out.println("깊이:"+(start+1));
		for (int i :list[start]) {
			if (!visited[i]) {
				depth[i]++;
				dfs(i);
			}
		}


	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		list=new ArrayList[n];
		for(int i=0;i<n;i++)
			list[i]=new ArrayList<>();

		for(int i=0;i<m;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m1].add(m2);
		}
		depth=new int[n];
		for(int i=0;i<n;i++) {
			visited=new boolean[n];
			dfs(i);
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(max<depth[i])
				max=depth[i];
		}
		for(int i=0;i<n;i++) {
			if(max==depth[i])
				System.out.print(i+1+" ");
		}
		
	}
}

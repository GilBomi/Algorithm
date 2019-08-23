package no1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static List<Integer>[] list;
	static boolean[] visited;

	public static void dfs(int start) {
		visited=new boolean[n];
		Arrays.fill(visited, false);
		System.out.print(start+1+" ");
		visited[start]=true;
		dfs_recur(start);
	}
	public static void dfs_recur(int start) {
		for(int i:list[start]) {
			if(visited[i])
				continue;
			visited[i]=true;
			System.out.print(i+1+" ");
			dfs_recur(i);
		}
	}
	//	public static void dfs(int start) { // 이것도  가능
	//		visited=new boolean[n];
	//		Arrays.fill(visited, false);
	//		dfs_recur(start);
	//	}
	//	public static void dfs_recur(int index) {
	//
	//		System.out.printf("%d ", index + 1);  // 정점 번호 출력
	//		visited[index] = true;
	//		for (int child : list[index]) {
	//			if (visited[child]) continue;
	//			dfs_recur(child);
	//		}
	//	}

	public static void bfs(int start) {
		boolean[] visited=new boolean[n];
		Arrays.fill(visited, false);
		Queue<Integer> queue=new ArrayDeque<>();
		queue.add(start);
		while(queue.size()>0) {
			int c=queue.remove();
			if(visited[c])
				continue;
			visited[c]=true;
			System.out.print(c+1+" ");
			for(Integer i:list[c]) {
				if(visited[i])
					continue;
				queue.add(i);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		int start=Integer.parseInt(token.nextToken())-1;
		list=new ArrayList[n]; 
		for(int i=0;i<n;i++) {
			list[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m1].add(m2);
			list[m2].add(m1);
		}
		for(int i=0;i<n;i++) {
			Collections.sort(list[i]);
		}
		dfs(start);
		System.out.println();
		bfs(start);
	}
}

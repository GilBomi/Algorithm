package no11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static List<Integer>[] list;
	static boolean[] visited;
	
	public static void bfs(int start) {
		Queue<Integer> queue=new ArrayDeque<>();
		queue.add(start);
		while(queue.size()>0) {
			int c=queue.remove();
			if(visited[c])
				continue;
			visited[c]=true;
			for(int i:list[c])
				queue.add(i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int 정점=Integer.parseInt(token.nextToken());
		int 간선=Integer.parseInt(token.nextToken());
		list=new ArrayList[정점];
		visited=new boolean[정점];
		Arrays.fill(visited, false);
		for(int i=0;i<정점;i++)
			list[i]=new ArrayList<>();
		for(int i=0;i<간선;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m1].add(m2);
			list[m2].add(m1);
		}
		int num=0;
		for(int i=0;i<정점;i++) {
			if(!visited[i]) {
				num++;
				bfs(i);
			}
		}
		System.out.println(num);
		
	}
}

package no1707;

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
	static List<Integer> list[];
	static boolean[] visited;
	static int[] 색깔;
	
	public static class Node {
		int vertex;
		int color;
		public Node(int vertex,int color) {
			this.vertex=vertex;
			this.color=color;
		}
	}		
	public static void bfs(int start) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(start,1));
		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int color=c.color;
			System.out.println("vertex:"+vertex+"color:"+color);
			if(visited[vertex])
				continue;
			색깔[vertex]=color;
			visited[vertex]=true;
			for(int i:list[vertex]) {
				if(color==1) 
					queue.add(new Node(i,2));
				else
					queue.add(new Node(i,1));
			}	
		}
	}
	public static String dfs(int start,int color) {
		int 이전색깔=color;
		for(int i:list[start]) {
			if(visited[i])
				continue;
			if(이전색깔==색깔[i]) {
				System.out.println("no~");
				return "NO";
			}
			System.out.println("이전:"+이전색깔+" 색깔:"+색깔[i]);
			이전색깔=색깔[i];
			visited[i]=true;
			dfs(i,이전색깔);
		}
		return "YES";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int 정점=Integer.parseInt(token.nextToken());
			int 간선=Integer.parseInt(token.nextToken());
			for(int j=0;j<간선;j++) {
				visited=new boolean[정점];
				Arrays.fill(visited, false);
				색깔=new int[정점];
				list=new ArrayList[정점];
				for(int k=0;k<list.length;k++)
					list[k]=new ArrayList<>();
				token=new StringTokenizer(reader.readLine());
				int m1=Integer.parseInt(token.nextToken())-1;
				int m2=Integer.parseInt(token.nextToken())-1;
				list[m1].add(m2);
				list[m2].add(m1);
			}
			bfs(0);
			Arrays.fill(visited,false);
			for(int u:색깔)
				System.out.println(u);
			dfs(0,1);
		}
		
		
	}
}

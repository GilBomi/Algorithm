package no1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static List<Node>[] list;
	static boolean[] visited;
	static int start;

	static class Node {
		int index;
		int 가중치;
		public Node(int index,int 가중치) {
			this.index=index;
			this.가중치=가중치;
		}
	}
	public static int dijkstra(int end) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.가중치-s2.가중치);
		queue.add(new Node(start,0));
		int min=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			int index=c.index;
			int 가중치=c.가중치;
			if(visited[index])
				continue;
			visited[index]=true;
			min=가중치;
			if(index==end) 
				return min;
			for(Node p:list[index]) {
				queue.add(new Node(p.index,가중치+p.가중치));
			}
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		int 정점 = Integer.parseInt(token.nextToken());
		int 간선 = Integer.parseInt(token.nextToken());
		start=Integer.parseInt(reader.readLine())-1;
		list=new ArrayList[정점];
		visited=new boolean[정점];
		for (int i = 0; i < 정점; ++i)
			list[i] = new ArrayList<>();
		for(int i=0;i<간선;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			int 가중치=Integer.parseInt(token.nextToken());
			list[m1].add(new Node(m2,가중치));
		}
		for(int i=0;i<정점;i++) {
			Arrays.fill(visited, false);
			int result=dijkstra(i);
			if(result==-1)
				System.out.println("INF");
			else
				System.out.println(result);
		}

	}
}

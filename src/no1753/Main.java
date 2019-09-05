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
	static int 거리[];

	static class Node {
		int index;
		int 가중치;
		public Node(int index,int 가중치) {
			this.index=index;
			this.가중치=가중치;
		}
	}
	public static void dijkstra(int start) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.가중치-s2.가중치);
		queue.add(new Node(start,0));
		
		while(queue.size()>0) {
			Node c=queue.remove();
			int index=c.index;
			int 가중치=c.가중치;
			if(visited[index])
				continue;
			if(거리[index]>가중치)
				거리[index]=가중치;
			visited[index]=true;
			for(Node p:list[index]) {
				queue.add(new Node(p.index,가중치+p.가중치));
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		int 정점 = Integer.parseInt(token.nextToken());
		int 간선 = Integer.parseInt(token.nextToken());
		start=Integer.parseInt(reader.readLine())-1;
		list=new ArrayList[정점];
		visited=new boolean[정점];
		거리=new int[정점];
		Arrays.fill(거리, Integer.MAX_VALUE);
		for (int i = 0; i < 정점; ++i)
			list[i] = new ArrayList<>();
		for(int i=0;i<간선;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			int 가중치=Integer.parseInt(token.nextToken());
			list[m1].add(new Node(m2,가중치));
		}
		dijkstra(start);
		for(int i=0;i<정점;i++) {
			Arrays.fill(visited, false);
//			int result=dijkstra(i);
			if(거리[i]==Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(거리[i]);
		}

	}
}

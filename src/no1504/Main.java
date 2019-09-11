package no1504;

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
	static int 정점;
	
	static class Node {
		int vertex;
		int 가중치;

		public Node(int vertex,int 가중치) {
			this.vertex=vertex;
			this.가중치=가중치;
		}
	}
	public static int dijkstra(int start,int end) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.가중치-s2.가중치);
		queue.add(new Node(start,0));
		visited=new boolean[정점];
		Arrays.fill(visited, false);
		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int distance=c.가중치;
			if(visited[vertex])
				continue;
			if(end==vertex)
				return distance;
			visited[vertex]=true;
			for(Node k:list[vertex]) {
				queue.add(new Node(k.vertex,distance+k.가중치));
			}
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		정점=Integer.parseInt(token.nextToken());
		int 간선=Integer.parseInt(token.nextToken());
		list=new ArrayList[정점];
		for(int i=0;i<list.length;i++) {
			list[i]=new ArrayList<Node>();
		}
		for(int i=0;i<간선;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			int 가중치=Integer.parseInt(token.nextToken());
			list[m1].add(new Node(m2,가중치));
			list[m2].add(new Node(m1,가중치));
		}
		token=new StringTokenizer(reader.readLine());
		int 필수1=Integer.parseInt(token.nextToken())-1;
		int 필수2=Integer.parseInt(token.nextToken())-1;
		
		int sum1=0;
		int n1=dijkstra(0,필수1);
		if(n1==-1) {
			System.out.println(n1);
			return;
		}
		sum1+=n1;
		n1=dijkstra(필수1,필수2);
		if(n1==-1) {
			System.out.println(n1);
			return;
		}
		sum1+=n1;
		n1=dijkstra(필수2,정점-1);
		if(n1==-1) {
			System.out.println(n1);
			return;
		}
		sum1+=n1;
		
		int sum2=0;
		int n2=dijkstra(0,필수2);
		if(n2==-1) {
			System.out.println(n2);
			return;
		}
		sum2+=n2;
		n2=dijkstra(필수2,필수1);
		if(n2==-1) {
			System.out.println(n2);
			return;
		}

		sum2+=n2;
		n2=dijkstra(필수1,정점-1);
		if(n2==-1) {
			System.out.println(n2);
			return;
		}
		sum2+=n2;
		System.out.println(Math.min(sum1, sum2));

	}
}

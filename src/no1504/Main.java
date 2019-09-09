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
	static int[] k;

	static class Node {
		int vertex;
		int 가중치;
		boolean v1,v2;

		public Node(int vertex,int 가중치,boolean v1,boolean v2) {
			this.vertex=vertex;
			this.가중치=가중치;
			this.v1=v1;
			this.v2=v2;
		}
	}
	public static int dijkstra(int 필수1,int 필수2,int end) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.가중치-s2.가중치);
		queue.add(new Node(0,0,false,false));
		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int distance=c.가중치;
			boolean v1=c.v1;
			boolean v2=c.v2;
			
			if(vertex==필수1)
				v1=true;
			if(vertex==필수2)
				v2=true;
			if(vertex==end) {
				if(v1==true && v2==true)
					return distance;
				continue;
			}
			if(k[vertex]>=k.length)
				continue;
			k[vertex]++;
			for(Node k:list[vertex]) {
				queue.add(new Node(k.vertex,distance+k.가중치,v1,v2));
			}
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int 정점=Integer.parseInt(token.nextToken());
		int 간선=Integer.parseInt(token.nextToken());
		list=new ArrayList[정점];
		for(int i=0;i<list.length;i++) {
			list[i]=new ArrayList<Node>();
		}
		k=new int[정점];
		for(int i=0;i<간선;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			int 가중치=Integer.parseInt(token.nextToken());
			list[m1].add(new Node(m2,가중치,false,false));
			list[m2].add(new Node(m1,가중치,false,false));
		}
		token=new StringTokenizer(reader.readLine());
		int 필수1=Integer.parseInt(token.nextToken())-1;
		int 필수2=Integer.parseInt(token.nextToken())-1;
		System.out.println(dijkstra(필수1,필수2,정점-1));

	}
}

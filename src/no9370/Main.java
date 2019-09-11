package no9370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static List<Node>[] list;
	static boolean[] visited;
	
	static class Node {
		int vertex;
		int distance;
		
		public Node(int vertex,int distance) {
			this.vertex=vertex;
			this.distance=distance;
		}
	}
	public static int dijkstra(int start,int end) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.distance-s2.distance);
		queue.add(new Node(start,0));
		visited=new boolean[list.length];
		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int distance=c.distance;
			if(visited[vertex])
				continue;
			if(end==vertex)
				return distance;
			visited[vertex]=true;
			for(Node p:list[vertex])
				queue.add(new Node(p.vertex,p.distance+distance));
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int 교차로=Integer.parseInt(token.nextToken());
			int 도로=Integer.parseInt(token.nextToken());
			int 목적지개수=Integer.parseInt(token.nextToken());
			list=new ArrayList[교차로];
			for(int w=0;w<list.length;w++) {
				list[w]=new ArrayList<Node>();
			}
			token=new StringTokenizer(reader.readLine());
			int 출발지=Integer.parseInt(token.nextToken())-1;
			int g=Integer.parseInt(token.nextToken())-1;
			int h=Integer.parseInt(token.nextToken())-1;
			for(int j=0;j<도로;j++) {
				token=new StringTokenizer(reader.readLine());
				int m1=Integer.parseInt(token.nextToken())-1;
				int m2=Integer.parseInt(token.nextToken())-1;
				int 가중치=Integer.parseInt(token.nextToken());
				list[m1].add(new Node(m2,가중치));
				list[m2].add(new Node(m1,가중치));				
			}
			List<Integer> list2=new ArrayList<>();
			for(int k=0;k<목적지개수;k++) {
				int 후보=Integer.parseInt(reader.readLine())-1;
				int result=dijkstra(출발지,후보);
				int sum1=0,sum2=0;
				int n1=dijkstra(출발지,g);
				int n2=dijkstra(g,h);
				int n3=dijkstra(h,후보);

				//System.out.println("result:"+result);
				if(n1!=0 && n2!=0 && n3!=0)
					sum1=n1+n2+n3;
	
				n1=dijkstra(출발지,h);
				n2=dijkstra(h,g);
				n3=dijkstra(g,후보);
				if(n1!=0 && n2!=0 && n3!=0)
					sum2=n1+n2+n3;
				if(result==0 || (sum1==0 && sum2==0)) {
					result=0;
					continue;
				}
				//System.out.println("sum1:"+sum1);
				//System.out.println("sum2:"+sum2);
				int min=0;
				if(sum1!=0 && sum2!=0)
					min=Math.min(sum1, sum2);
				else if(sum1==0)
					min=sum2;
				else if(sum2==0)
					min=sum1;
				if(min>result) {
					result=0;
					//System.out.println("걸렸어");
					continue;
				}
				//System.out.println("후보:"+후보);
				list2.add(후보+1);
			}
			Collections.sort(list2);
			for(int e:list2)
				System.out.print(e+" ");
			System.out.println();
			
		}
		
		
	}
}

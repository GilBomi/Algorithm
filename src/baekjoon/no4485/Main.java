package baekjoon.no4485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[][] array;
	static boolean[][] visited;
	static int n;
	
	static class Node {
		int 행,열,distance;
		public Node(int 행,int 열,int distance) {
			this.행=행;
			this.열=열;
			this.distance=distance;
		}
	}
	
	public static int dijkstra(int m1,int m2) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.distance-s2.distance);
		queue.add(new Node(m1,m2,array[m1][m2]));
		while(queue.size()>0) {
			Node c=queue.remove();
			int 행=c.행;
			int 열=c.열;
			int distance=c.distance;
			
			if(visited[행][열])
				continue;
//			System.out.println(행+" "+열+" "+distance);
			if(열==n-1 && 행==n-1) {
				return distance;
			}
			visited[행][열]=true;
			if(행>0)queue.add(new Node(행-1,열,distance+array[행-1][열]));
			if(행<n-1)queue.add(new Node(행+1,열,distance+array[행+1][열]));
			if(열>0)queue.add(new Node(행,열-1,distance+array[행][열-1]));
			if(열<n-1)queue.add(new Node(행,열+1,distance+array[행][열+1]));
		}
		System.out.println("끝");
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list=new ArrayList<>();
		while(true) {
			n=Integer.parseInt(reader.readLine());
			if(n==0)
				break;
			visited=new boolean[n][n];
			for(boolean[] u:visited)
				Arrays.fill(u, false);
			array=new int[n][n];
			for(int j=0;j<n;j++) {
				StringTokenizer token=new StringTokenizer(reader.readLine());
				for(int k=0;k<n;k++) {
					array[j][k]=Integer.parseInt(token.nextToken());	
				}
			}
			list.add(dijkstra(0,0));
		}
		
		for(int i=0;i<list.size();i++) 
			System.out.println("Problem "+(i+1)+": "+list.get(i));
		
		}
}

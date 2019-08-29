package no7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int 도착행,도착열; 
	static int 변;
	static boolean[][] visited;
	
	static class Node {
		int 행,열,distance;
		public Node(int 행,int 열,int distance) {
			this.행=행;
			this.열=열;
			this.distance=distance;
		}
	}
	public static int bfs(int n,int m) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(n,m,0));
		int min=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			int 행=c.행;
			int 열=c.열;
			int distance=c.distance;
			if(행>=변 || 행<0 || 열>=변 || 열<0)
				continue;
			if(visited[행][열])
				continue;
			visited[행][열]=true;
			if(행==도착행 && 열==도착열)
				return distance;
			queue.add(new Node(행-1,열+2,distance+1));
			queue.add(new Node(행-2,열+1,distance+1));
			queue.add(new Node(행-1,열-2,distance+1));
			queue.add(new Node(행-2,열-1,distance+1));
			queue.add(new Node(행+1,열-2,distance+1));
			queue.add(new Node(행+2,열-1,distance+1));
			queue.add(new Node(행+1,열+2,distance+1));
			queue.add(new Node(행+2,열+1,distance+1));
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		for(int i=0;i<n;i++) {
			변=Integer.parseInt(reader.readLine());
			visited=new boolean[변][변];
			for(boolean[] m:visited)
				Arrays.fill(m, false);
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int 시작행=Integer.parseInt(token.nextToken());
			int 시작열=Integer.parseInt(token.nextToken());
			token=new StringTokenizer(reader.readLine());
			도착행=Integer.parseInt(token.nextToken());
			도착열=Integer.parseInt(token.nextToken());
			System.out.println(bfs(시작행,시작열));
		}


	}
}

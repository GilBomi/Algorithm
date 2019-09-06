package no1261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[][] 미로;
	static boolean[][] visited;
	static class Node {
		int 행,열,벽;
		public Node(int 행,int 열,int 벽) {
			this.행=행;
			this.열=열;
			this.벽=벽;
		}
	}
	public static int dijkstra(int n,int m) {
		PriorityQueue<Node> queue=new PriorityQueue<>((s1,s2)->s1.벽-s2.벽);
		queue.add(new Node(0,0,0));
		while(queue.size()>0) {
			Node c=queue.remove();
			int 행=c.행;
			int 열=c.열;
			int 벽=c.벽;
			if(visited[행][열])
				continue;
			if(행==m-1 && 열==n-1)
				return 벽;
			//System.out.println(행+" "+열+" "+벽);
			visited[행][열]=true;
			if(행>0)	queue.add(new Node(행-1,열,벽+미로[행-1][열]));
			if(행<m-1)	queue.add(new Node(행+1,열,벽+미로[행+1][열]));
			if(열>0)	queue.add(new Node(행,열-1,벽+미로[행][열-1]));
			if(열<n-1)	queue.add(new Node(행,열+1,벽+미로[행][열+1]));

		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		미로=new int[m][n];
		visited=new boolean[m][n];
		for(boolean[] i:visited)
			Arrays.fill(i, false);
		for(int i=0;i<m;i++) {
			String s=reader.readLine();
			for(int j=0;j<n;j++) {
				미로[i][j]=Integer.parseInt(s.substring(j,j+1));
			}
		}
		System.out.println(dijkstra(n,m));

	}
}

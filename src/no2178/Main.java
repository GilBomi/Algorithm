package no2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int 행,열;
	static int[][] array;
	static boolean[][] visited;
	
	static class Node {
		int n;
		int m;
		int distance;
		public Node(int n,int m,int distance) {
			this.n=n;
			this.m=m;
			this.distance=distance;
		}
	}
	public static int bfs(int n1,int m1) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(n1,m1,1));
		int min=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			int n=c.n;
			int m=c.m;
			int distance=c.distance;
			if(n>=행 || n<0 ||m>=열 || m<0 )
				continue;
			if(array[n][m]!=1)
				continue;
			if(visited[n][m])
				continue;
			visited[n][m]=true;
			min=distance;
			if(n==행-1 && m==열-1)
				return min;
			queue.add(new Node(n-1,m,distance+1));
			queue.add(new Node(n,m-1,distance+1));
			queue.add(new Node(n+1,m,distance+1));
			queue.add(new Node(n,m+1,distance+1));
			ArrayDeque<Integer> queue1=new ArrayDeque<>();
			
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		행=Integer.parseInt(token.nextToken());
		열=Integer.parseInt(token.nextToken());
		array=new int[행][열];
		visited=new boolean[행][열];
		for(boolean[] r:visited)
			Arrays.fill(r, false);
		for(int i=0;i<행;i++) {
			String s=reader.readLine();
			for(int j=0;j<열;j++) {
				array[i][j]=Integer.parseInt(s.substring(j,j+1));
			}
		}
//		for(int i=0;i<행;i++) {
//			for(int j=0;j<열;j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(bfs(0,0));
	}
}

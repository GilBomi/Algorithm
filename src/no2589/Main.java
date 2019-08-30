package no2589;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int 행;
	static int 열;
	static String[][] 지도;
	static boolean[][] visited;
	
	static class Node {
		int n,m,distance;
		public Node(int n,int m,int distance) {
			this.n=n;
			this.m=m;
			this.distance=distance;
		}
	}
	public static int bfs(int 시작열,int 시작행) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(시작열,시작행,0));
		int min=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			int n=c.n;
			int m=c.m;
			int distance=c.distance;
			if(n>=행 || n<0 || m>=열 || m<0)
				continue;
			if(지도[n][m].equals("W"))
				continue;
			if(visited[n][m])
				continue;
			//System.out.println(n+" "+m);
			visited[n][m]=true;
			min=distance;
			queue.add(new Node(n,m+1,distance+1));
			queue.add(new Node(n,m-1,distance+1));
			queue.add(new Node(n+1,m,distance+1));
			queue.add(new Node(n-1,m,distance+1));
		}
		return min;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		행=Integer.parseInt(token.nextToken());
		열=Integer.parseInt(token.nextToken());
		지도=new String[행][열];
		visited=new boolean[행][열];
//		for(boolean[] u:visited)
//			Arrays.fill(u, false);
		for(int i=0;i<행;i++) {
			String s=reader.readLine();
			for(int j=0;j<열;j++) {
				지도[i][j]=s.substring(j,j+1);
			}
		}
		int max=0;
		for(int i=0;i<행;i++) {
			for(int j=0;j<열;j++) {
				if(지도[i][j].equals("W")) 
					continue;
				for(boolean[] u:visited)
					Arrays.fill(u, false);
				int n=bfs(i,j);
				if(n>max)
					max=n;
			}
		}
		System.out.println(max);
		
	}
}

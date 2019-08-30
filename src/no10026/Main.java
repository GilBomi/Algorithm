package no10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	static String[][] 그림;
	static boolean[][] visited;
	static int N;

	static class Node {
		int n,m;
		public Node(int n,int m) {
			this.n=n;
			this.m=m;
		}
	}
	public static void bfs(int 행,int 열,String 사람) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(행,열));
		String 색=그림[행][열];
		while(queue.size()>0) {
			Node c=queue.remove();
			int n=c.n;
			int m=c.m;
			if(n<0 || n>=N || m<0 || m>=N)
				continue;
			if(visited[n][m])
				continue;
			if(사람.equals("적록")) {
				if(색.equals("R") || 색.equals("G")) {
					if(그림[n][m].equals("B"))
						continue;
				}
				else {
					if(!그림[n][m].equals(색))
						continue;	
				}
			}
			else { 
				if(!그림[n][m].equals(색))
					continue;
			}
			visited[n][m]=true;
			queue.add(new Node(n,m+1));
			queue.add(new Node(n,m-1));
			queue.add(new Node(n+1,m));
			queue.add(new Node(n-1,m));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(reader.readLine());
		그림=new String[N][N];
		for(int i=0;i<N;i++) {
			String s=reader.readLine();
			for(int j=0;j<N;j++) {
				그림[i][j]=s.substring(j,j+1);
			}
		}

		visited=new boolean[N][N];
		for(boolean[] u:visited)
			Arrays.fill(u, false);
		int 구역수=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(visited[i][j])
					continue;
				bfs(i,j,"정상");
				구역수++;
			}
		}
		System.out.print(구역수+" ");

		for(boolean[] u:visited)
			Arrays.fill(u, false);
		구역수=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(visited[i][j])
					continue;
				bfs(i,j,"적록");
				구역수++;
			}
		}
		System.out.print(구역수);
	}

}

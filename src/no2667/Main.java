package no2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Main {
	static int n;
	static int 단지[][];
	static boolean[][] visited;
	static int 횟수;

	static class Node {
		int 행,열;

		public Node(int 행,int 열) {
			this.행=행;
			this.열=열;
		}
	}
	public static int bfs(int 행,int 열) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(행,열));
		int 반복횟수=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			int m1=c.행;
			int m2=c.열;
			if(m1<0 || m1>=n ||m2<0 || m2>=n)
				continue;
			if(visited[m1][m2])
				continue;
			if(단지[m1][m2]==0)
				continue;
			visited[m1][m2]=true;
			반복횟수++;
			queue.add(new Node(m1+1,m2));
			queue.add(new Node(m1-1,m2));
			queue.add(new Node(m1,m2+1));
			queue.add(new Node(m1,m2-1));
		}

		return 반복횟수;

	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(reader.readLine());
		단지=new int[n][n];
		visited=new boolean[n][n];
		for(boolean[] i:visited)
			Arrays.fill(i,false);
		for(int i=0;i<n;i++) {
			String s=reader.readLine();
			for(int j=0;j<n;j++) {
				단지[i][j]=Integer.parseInt(s.substring(j,j+1));
				//System.out.println(단지[i][j]);
			}
		}
		List<Integer> list=new ArrayList<>();
		int 단지갯수=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j]) {
					if(단지[i][j]==1) {
						list.add(bfs(i,j));
						단지갯수++;
					}
				}
			}
		}
		System.out.println(단지갯수);
		Collections.sort(list);
		for(int i:list)
			System.out.println(i);

	}
}

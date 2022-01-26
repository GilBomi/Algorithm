package baekjoon.no2146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

public class Main {
	static int[][] array;
	static int n;
	static boolean[][] visited;

	static class Node {
		int x,y,distance;
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
		public Node(int x,int y,int distance) {
			this.x=x;
			this.y=y;
			this.distance=distance;
		}
	}
	public static void bfs(int xx,int yy,int index) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(xx,yy));
		while(queue.size()>0) {
			Node c=queue.remove();
			int x=c.x;
			int y=c.y;
			if(x<0 || x>=n || y<0 || y>=n)
				continue;
			if(array[x][y]==1) {
				queue.add(new Node(x+1,y));
				queue.add(new Node(x-1,y));
				queue.add(new Node(x,y+1));
				queue.add(new Node(x,y-1));				
				array[x][y]=index;
			}
		}
	}
	public static int bfs2(int xx,int yy,int index) {
		Queue<Node> queue=new ArrayDeque<>();
		if(xx<n-1)queue.add(new Node(xx+1,yy,1));
		if(xx>0)queue.add(new Node(xx-1,yy,1));
		if(yy<n-1)queue.add(new Node(xx,yy+1,1));
		if(yy>0)queue.add(new Node(xx,yy-1,1));				
		while(queue.size()>0) {
			Node c=queue.remove();
			int x=c.x;
			int y=c.y;
			int distance=c.distance;
			if(x<0 || x>=n || y<0 || y>=n)
				continue;
			if(visited[x][y])
				continue;
			visited[x][y]=true;
			if(array[x][y]==index)
				continue;
			//System.out.println("x:"+x+" "+y+" "+distance);
			if(array[x][y]!=0 && array[x][y]!=index) {
				return distance;

			}if(x<n-1)queue.add(new Node(x+1,y,distance+1));
			if(x>0)queue.add(new Node(x-1,y,distance+1));
			if(y<n-1)queue.add(new Node(x,y+1,distance+1));
			if(y>0)queue.add(new Node(x,y-1,distance+1));				
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(reader.readLine());
		array=new int[n][n];

		for(int i=0;i<n;i++) {
			String s=reader.readLine();
			String[] a=s.split(" ");
			for(int j=0;j<n;j++) {
				array[i][j]=Integer.parseInt(a[j]);
			}

		}
		int index=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(array[i][j]==1) {
					bfs(i,j,index++);
				}
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		visited=new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(boolean[] p:visited)
					Arrays.fill(p,false);
				if(array[i][j]!=0) {
					int distance=bfs2(i,j,array[i][j]);
					if(distance!=-1) 
						list.add(distance);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0)-1);

	}
}
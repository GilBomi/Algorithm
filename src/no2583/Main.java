package no2583;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean array[][];
	static int m,n;
	
	static class Node {
		int x,y;
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		m=Integer.parseInt(token.nextToken());
		n=Integer.parseInt(token.nextToken());
		int k=Integer.parseInt(token.nextToken());
		array=new boolean[m][n];
		for(boolean[] i:array)
			Arrays.fill(i, false);
		for(int i=0;i<k;i++) {
			token=new StringTokenizer(reader.readLine());
			int x1=Integer.parseInt(token.nextToken());
			int y1=Integer.parseInt(token.nextToken());
			int x2=Integer.parseInt(token.nextToken());
			int y2=Integer.parseInt(token.nextToken());
			채우기(x1,y1,x2,y2);
		}
		int 영역개수=0;
		List<Integer> list=new ArrayList<>();
		for(int x=0;x<n;x++) {
			for(int y=0;y<m;y++) {
				if(!array[y][x]) {
					영역개수++;
					list.add(bfs(x,y));
				}
			}
		}
		System.out.println(영역개수);
		Collections.sort(list);
		for(int i:list)
			System.out.print(i+" ");
	}
	public static int bfs(int xx,int yy) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(xx,yy));
		int 개수=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			int x=c.x;
			int y=c.y;
			if(x<0 || x>=n || y<0 || y>=m)
				continue;
			if(array[y][x])
				continue;
			array[y][x]=true;
			개수++;
			queue.add(new Node(x+1,y));
			queue.add(new Node(x-1,y));
			queue.add(new Node(x,y+1));
			queue.add(new Node(x,y-1));
		}
		return 개수;
	}
	public static void 채우기(int x1,int y1,int x2,int y2) {
		for(int x=x1;x<x2;x++) {
			for(int y=y1;y<y2;y++) {
				if(!array[y][x])
					array[y][x]=true;
			}
		}
	}
}

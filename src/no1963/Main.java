package no1963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static boolean[] 소수;

	static class Node {
		String vertex;
		int distance;

		public Node(String vertex,int distance) {
			this.vertex=vertex;
			this.distance=distance;
		}
	}
	public static int bfs(String start,String end) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(start,0));
		int min=0;
		while(queue.size()>0) {
			Node c=queue.remove();
			String vertex=c.vertex;
			int distance=c.distance;
			if(visited[Integer.parseInt(vertex)])
				continue;
			visited[Integer.parseInt(vertex)]=true;
			min=distance;
			if(vertex.equals(end)) 
				return min;
			for(int i=0;i<4;i++) {
				for(int j=0;j<10;j++) {
					String k;
					if(i==0)
						k=Integer.toString(j)+vertex.substring(i+1);
					else if(i==3)
						k=vertex.substring(0,i)+j;
					else
						k=vertex.substring(0,i)+j+vertex.substring(i+1);
					if(visited[Integer.parseInt(k)])
						continue;
					if(Integer.parseInt(k)<1000)
						continue;
					//System.out.println("k:"+k);
					if(소수[Integer.parseInt(k)]) {
						queue.add(new Node(k,distance+1));
					}
				}
			}
		}
		return -1;
	}
	public static boolean[] 소수찾기(boolean[] 소수) {
		for(int i=2;i*i<10000;i++) {
			for(int j=2;j*i<10000;j++) {
				if(!소수[j*i])
					continue;
				소수[j*i]=false;
			}
		}
		return 소수;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		소수=new boolean[10000];
		Arrays.fill(소수, true);
		소수=소수찾기(소수);
		for(int i=0;i<n;i++) {
			visited=new boolean[10000];
			Arrays.fill(visited, false);
			StringTokenizer token=new StringTokenizer(reader.readLine());
			String start=token.nextToken();
			String end=token.nextToken();
			int 횟수=bfs(start,end);
			if(횟수==-1)
				System.out.println("Impossible");
			else 
				System.out.println(횟수);
		}
	}
}

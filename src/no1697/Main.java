package no1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	//static List<Integer> list[];
	static boolean[] visited;

	static class Node {
		int vertex;
		int distance;
		public Node(int vertex,int distance) {
			this.vertex=vertex;
			this.distance=distance;
		}
	}
	public static int bfs(int start,int end) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(start,0));
		int min=0;

		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int distance=c.distance;
			if(visited[vertex])
				continue;
			visited[vertex]=true;
			min=distance;
			if(vertex==end) 
				return min;	
			if(vertex-1<0) {
				queue.add(new Node(vertex+1,distance+1));
				queue.add(new Node(vertex*2,distance+1));
			}
			else if(vertex+1>100000)  {
				queue.add(new Node(vertex-1,distance+1));	
			}
			else if(vertex*2>100000) {
				queue.add(new Node(vertex-1,distance+1));
				queue.add(new Node(vertex+1,distance+1));
			}
			else {
				queue.add(new Node(vertex-1,distance+1));
				queue.add(new Node(vertex+1,distance+1));
				queue.add(new Node(vertex*2,distance+1));
			}
		}
		return min;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		visited=new boolean[100001];
		Arrays.fill(visited, false);
		int min=bfs(n,m);
		System.out.println(min);



	}
}

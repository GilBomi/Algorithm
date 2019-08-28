package no5014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int U;
	static int D;

	public static class Node {
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

		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int distance=c.distance;
			if(visited[vertex])
				continue;
			visited[vertex]=true;
			//System.out.println("v:"+vertex);
			if(vertex==end)
				return distance;
			if(vertex+U<visited.length &&vertex-D>=0) {
				queue.add(new Node(vertex+U,distance+1));
				queue.add(new Node(vertex-D,distance+1));
			}
			else if(vertex+U>=visited.length &&vertex-D>=0) {
				queue.add(new Node(vertex-D,distance+1));
			}
			else if(vertex+U<visited.length &&vertex-D<0) {
				queue.add(new Node(vertex+U,distance+1));
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int F=Integer.parseInt(token.nextToken());
		int S=Integer.parseInt(token.nextToken())-1;
		int G=Integer.parseInt(token.nextToken())-1;
		U=Integer.parseInt(token.nextToken());
		D=Integer.parseInt(token.nextToken());
		visited=new boolean[F];
		Arrays.fill(visited, false);
		int min=bfs(S,G);
		if(min==-1)
			System.out.println("use the stairs");
		else
			System.out.println(min);
	}
}

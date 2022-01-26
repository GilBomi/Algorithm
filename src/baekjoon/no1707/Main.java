package baekjoon.no1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static List<Integer> list[];
	static boolean[] visited;
	static int[] 색깔;
	
	public static class Node {
		int vertex;
		int color;
		public Node(int vertex,int color) {
			this.vertex=vertex;
			this.color=color;
		}
	}		
	public static String bfs(int start) {
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(new Node(start,1));
		while(queue.size()>0) {
			Node c=queue.remove();
			int vertex=c.vertex;
			int color=c.color;
			if(visited[vertex]) {
				if(색깔[vertex]==color) 
					continue;
				else
					return "NO";
			}
			//System.out.println("vertex:"+vertex+" color:"+color);
			색깔[vertex]=color;
			visited[vertex]=true;
			for(int i:list[vertex]) {
				if(color==1) 
					queue.add(new Node(i,2));
				else if(color==2)
					queue.add(new Node(i,1));
			}	
		}
		return "YES";
	}
	/*bfs로 int[]색깔 저장까지는 괜찮았는데 dfs의 탐색에서 뭔가 잘못됨*/
//	public static String dfs(int start,int color) {
//		int 이전색깔=color;
//		if(이전색깔==색깔[start]) 
//			return "NO";
//		visited[start]=true;
//		이전색깔=색깔[start];
//		for(int i:list[start]) {
//			if(visited[i])
//				continue;
//			//System.out.println("vertex:"+i+" 이전:"+이전색깔+" 색깔:"+색깔[i]);
//			//이전색깔=색깔[i];
//			//visited[i]=true;
//			return dfs(i,이전색깔);
//		}
//		return "YES";
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int 정점=Integer.parseInt(token.nextToken());
			int 간선=Integer.parseInt(token.nextToken());
			visited=new boolean[정점];
			Arrays.fill(visited, false);
			색깔=new int[정점];
			list=new ArrayList[정점];
			for(int k=0;k<list.length;k++)
				list[k]=new ArrayList<>();
			for(int j=0;j<간선;j++) {
				token=new StringTokenizer(reader.readLine());
				int m1=Integer.parseInt(token.nextToken())-1;
				int m2=Integer.parseInt(token.nextToken())-1;
				list[m1].add(m2);
				list[m2].add(m1);
			}
			String s="";
			for(int j=0;j<정점;j++) {
				if(visited[j])
					continue;
				s=bfs(j);
				if(s.equals("NO")) 
					break;
			}
			System.out.println(s);
			//Arrays.fill(visited,false);
//			for(int u:색깔)
//				System.out.println(u);
//			String result="";
//			for(int j=0;j<정점;j++) {
//				if(visited[j])
//					continue;
//				result=dfs(j,2);
//				if(result.equals("NO")) {
//					break;
//				}
//			}
			//System.out.println(result);
		}
		
		
	}
}

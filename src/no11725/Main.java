package no11725;

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
	static List<Integer>[] list;
	static boolean[] visited;
	static int[] result;
	
	public static void bfs(int start) {
		Queue<Integer> queue=new ArrayDeque<>();
		queue.add(start);
		while(queue.size()>0) {
			int c=queue.remove();
			if(visited[c])
				continue;
			visited[c]=true;
			for(int i:list[c]) {
				if(visited[i])
					continue;
				result[i]=c+1;
				bfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		list=new ArrayList[n];
		for(int i=0;i<n;i++) 
			list[i]=new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m1].add(m2);
			list[m2].add(m1);
		}
		visited=new boolean[n];
		Arrays.fill(visited, false);
		result=new int[n];
		bfs(0);
		for(int i=1;i<result.length;i++)
			System.out.println(result[i]);
	}
}

package no2644;

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
	
	public static int bfs(int start,int end) {
		Queue<Integer> queue=new ArrayDeque<>();
		queue.add(start);
		int num=0;
		while(queue.size()>0) {
			int c=queue.remove();
			if(visited[c])
				continue;
			if(c==end) 
				return num;
			visited[c]=true;
			for(int i=0;i<list[c].size();i++) {
				queue.add(i);
				if(i==0)
					num++;
			}
		}
		return -1;		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(reader.readLine());
		list=new ArrayList[num];
		visited=new boolean[num];
		Arrays.fill(visited, false);
		for(int i=0;i<num;i++) 
			list[i]=new ArrayList<>();
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n1=Integer.parseInt(token.nextToken())-1;
		int n2=Integer.parseInt(token.nextToken())-1;
		token=new StringTokenizer(reader.readLine());
		int 반복횟수=Integer.parseInt(token.nextToken());
		for(int i=0;i<반복횟수;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m1].add(m2);
			list[m2].add(m1);			
		}
		int 관계=bfs(n1,n2);
		System.out.println(관계);
	}
}

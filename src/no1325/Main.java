package no1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<Integer>[] list;
	static boolean[] visited;
	static int[] depth;
		
	public static int dfs(int start) {
		int max=0;
		for(int i:list[start]) {
			if(visited[i])
				continue;
			visited[i]=true;
			int depth=dfs(i);
			if(depth>max) 
				max=depth;
		}
		return max+1;
	}
	public static int findMax() {
		int max=0;
		for(int i=0;i<list.length;i++) {
			if(max<depth[i])
				max=depth[i];
		}
		return max;
	}
	public static void 같은값찾기(int max) {
		for(int i=0;i<list.length;i++) {
			if(depth[i]==max)
				System.out.print(i+1+" ");
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		list=new ArrayList[n];
		for(int i=0;i<n;i++)
			list[i]=new ArrayList<>();
		
		for(int i=0;i<m;i++) {
			token=new StringTokenizer(reader.readLine());
			int m1=Integer.parseInt(token.nextToken())-1;
			int m2=Integer.parseInt(token.nextToken())-1;
			list[m2].add(m1);
		}
		depth=new int[n];
		for(int i=0;i<n;i++) { // depth배열에 해당 인덱스마다 최대 깊이(dfs)값 저장
			visited=new boolean[n];
			depth[i]=dfs(i);
		}
		같은값찾기(findMax());
		
	}
}

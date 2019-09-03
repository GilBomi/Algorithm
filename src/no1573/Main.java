package no1573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static Set<String> set;
	static int n;
	static boolean[] visited;
	
	static class Link {
		String 알파벳;
		int distance;
		Link lLink,rLink;
		
		public Link(String 알파벳) {
			this.알파벳=알파벳;
		}
		public Link(String 알파벳,int distance) {
			this.알파벳=알파벳;
			this.distance=distance;
		}
		public Link(String 알파벳,Link l,Link r,int distance) {
			this.알파벳=알파벳;
			this.lLink=l;
			this.rLink=r;
			this.distance=distance;
		}
		public void add(String a) {
			if(알파벳.compareTo(a)>0) {
				if(lLink!=null) 
					lLink.add(a);
				else
					lLink=new Link(a);
			} else if(알파벳.compareTo(a)<0) {
				if(rLink!=null) 
					rLink.add(a);
				else
					rLink=new Link(a);
			}
		}
		public void print() { // 프리오더 출력
			System.out.print(this.알파벳);
			lLink.print();
			rLink.print();
		}
	}
	public static void dijkstra(String start) {
		PriorityQueue<Link> queue=new PriorityQueue<>((s1,s2)->s1.알파벳.compareTo(s2.알파벳));
		Link root=new Link(start,1);
		queue.add(root);
		while(queue.size()>0) {
			Link c=queue.remove();
			String 알파벳=c.알파벳;
			int distance=c.distance;
			if((int)(알파벳.charAt(0))<97 || (int)(알파벳.charAt(0))>97+n)
				continue;
			if(visited[(int)(알파벳.charAt(0)-97)])
				continue;
			if(distance==n) {
				root.print();
				System.out.println();
			}
			if(set.size()==n) {
				System.out.println("끝");
				return;
			}
			System.out.println("알파벳:"+알파벳);
			visited[(int)(알파벳.charAt(0)-97)]=true;
			
			for(int i=0;i<n;i++) {
				queue.add(new Link(Character.toString((char)("a".charAt(0)+i)),c.rLink,null,distance+1));
			
			}
			
			
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		n=Integer.parseInt(token.nextToken());
		int Index=Integer.parseInt(token.nextToken());
		visited=new boolean[n];
		Arrays.fill(visited, false);
		set=new HashSet<>();
		dijkstra("a");
		
		String k="a";
		System.out.println((char)(k.charAt(0)+1));
		System.out.println((int)(k.charAt(0)));
		System.out.println(('a'+1));
		System.out.println((int)('z'));
		

	}
}

package baekjoon.no1573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static Set<String> set;
	static Set<String> result;
	static int n;
	static List<Link> visited;
	static int index;

	
	static class Link implements Cloneable{
		String 알파벳;
		int distance;
		Link lLink, rLink;
		String w="";

		public Link() {
			
		}
		public Link(String 알파벳) {
			this.알파벳 = 알파벳;
		}

		public Link(String 알파벳, int distance) {
			this.알파벳 = 알파벳;
			this.distance = distance;
		}
//		public Link copyLink(Link root) {
//			if(root==null)
//				return null;
//			else {
//				Link k=new Link(root.알파벳);
//				k.lLink=copyLink(root.lLink);
//				k.rLink=copyLink(root.rLink);
//				return k;
//			}
//		}


		public void add(String a) {
			if (알파벳.compareTo(a)>0) {
                if (lLink == null) lLink = new Link(a);
                else lLink.add(a);
            } else if (알파벳.compareTo(a)<0) {
            	if (rLink == null) rLink = new Link(a);
                else rLink.add(a);
            }
		}

		public String print() { // 프리오더 출력
			w="";
			w+=알파벳;
			//System.out.println(알파벳);
			if (lLink != null)
				w+=lLink.print();
			if (rLink != null)
				w+=rLink.print();
			return w;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException { // public 으로 바꿔주자.
			return super.clone();
		}
	}

	public static void dijkstra(String start) {
		PriorityQueue<Link> queue = new PriorityQueue<>((s1, s2) -> s1.알파벳.compareTo(s2.알파벳));
		Link root = new Link(start, 1);
		queue.add(root);
		int 반복=0;
		while (queue.size() > 0) {
			Link c = queue.remove();
			String 알파벳 = c.알파벳;
			int distance = c.distance;
			String w=c.w;
			
			if ((int) (알파벳.charAt(0)) < 97 || (int) (알파벳.charAt(0)) > 97 + n)
				continue;
			if (set.contains(c.w))
				continue;
			set.add(c.w);
			if(c.w.length()==4) {
				result.add(w);
			}
			Link[] list = new Link[n];
			for(int i=0;i<n;i++) {
				try {
					list[i]=(Link)c.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("반복:"+반복++);
			System.out.println("원래:"+c.print());
			for (int i = 0; i < n; i++) {
				System.out.println("i:"+i);
				list[i].add(Character.toString((char) ('a' + i)));
				System.out.print("c:"+list[i].print());
				System.out.println();
				queue.add(list[i]);
			}
			System.out.println("이후:"+c.print());
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(token.nextToken());
		index = Integer.parseInt(token.nextToken());

		set = new HashSet<>();
		result = new HashSet<>();
		visited = new ArrayList<>();
		dijkstra("a");
		for(String i:result)
			System.out.println(i);

	}
}

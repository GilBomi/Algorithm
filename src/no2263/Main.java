package no2263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static class 트리 {
		int n;
		트리 right;
		트리 left;
		
		public 트리(int n) {
			this.n=n;
		}
		public void print() { // 프리오더로 출력
			System.out.print(n+" ");
			if(this.left!=null)
				this.left.print();
			if(this.right!=null)
				this.right.print();
		}
		public void add(int n) {
			if(this.n<n) {
				if(this.right==null)
					this.right=new 트리(n);
				else
					this.right.add(n);
			} 
			else if(this.n>n) {
				if(this.left==null)
					this.left=new 트리(n);
				else
					this.left.add(n);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		List<Integer> inorder=new ArrayList<>();
		List<Integer> postorder=new ArrayList<>();
		StringTokenizer token=new StringTokenizer(reader.readLine());
		for(int j=0;j<n;j++) 
			inorder.add(Integer.parseInt(token.nextToken()));
		token=new StringTokenizer(reader.readLine());
		for(int j=0;j<n;j++) 
			postorder.add(Integer.parseInt(token.nextToken()));
		트리 tree=new 트리(postorder.get(postorder.size()-1));
		boolean[] visit=new boolean[n];
		Arrays.fill(visit, false);
		while(true) {
			for(int i=0;i<n;i++) {
				
			}
		}
	}
}

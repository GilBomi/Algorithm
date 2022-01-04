package no5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static class Tree {
		int n;
		Tree left;
		Tree right;
		public Tree(int n) {
			this.n=n;
		}
		public void add(int n) { // 전위순위로 저장
			if(this.n<n) {
				if(this.right==null)
					this.right=new Tree(n);
				else 
					this.right.add(n);
			} else if(this.n>n) {
				if(this.left==null)
					this.left=new Tree(n);
				else 
					this.left.add(n);
			}
		}
		public void print() { // 후위 순휘로 출력
			if(this.left!=null) {
				left.print();
			}
			if(this.right!=null) {
				right.print();
			}
			System.out.println(this.n);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Tree root;
		String s=reader.readLine();
		if(s==null)
			return;
		else 
	
			root=new Tree(Integer.parseInt(s));
		while(true) {
			s=reader.readLine();
			if(s==null || s.length()==0)
				break;
			root.add(Integer.parseInt(s));
		}
		root.print();
	}
}

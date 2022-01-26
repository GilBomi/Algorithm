package baekjoon.no10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		LinkedList list=new LinkedList<String>();
		int n=input.nextInt();
		Queue<String> queue = new LinkedList<String>();
		String f="";
		for(int i=0;i<n+1;i++) {
			String s=input.nextLine();
			String[] array=s.split(" ");
			switch(array[0]) {
			case "push":
				queue.offer(array[1]);
				f=array[1];
				break;
			case "pop":
				if(queue.size()==1)
					f="";
				if(queue.isEmpty())
					System.out.println("-1");
				else
					System.out.println(queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "front":
				if(queue.isEmpty())
					System.out.println("-1");
				else
					System.out.println(queue.peek());
				break;
			case "back":
				if(queue.isEmpty())
					System.out.println("-1");
				else 
					System.out.println(f);
				break;
			}
		}
		
		
	}
}

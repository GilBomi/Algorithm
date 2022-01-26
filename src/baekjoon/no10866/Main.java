package baekjoon.no10866;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String[] deque=new String[n];
		int front=0;
		int back=0;
		for(int i=0;i<n+1;i++) {
			String s=input.nextLine();
			String[] array=s.split(" ");
			switch(array[0]) {
			case "push_front":
				for(int j=back;j>=front;j--) {
					deque[j+1]=deque[j];
				}
				back++;
				deque[front]=array[1];
				break;
			case "push_back":
				deque[back]=array[1];
				back++;
				break;
			case "pop_front":
				if(front==back)
					System.out.println("-1");
				else {
					System.out.println(deque[front]);
					front++;
					if(front>back)
						front=back;
				}
				break;
			case "pop_back":
				if(front==back)
					System.out.println("-1");
				else {
					System.out.println(deque[back-1]);
					back--;
					if(back<front)
						back=front;
				}
				break;
			case "size":
				System.out.println(back-front);
				break;
			case "empty":
				if(front==back)
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "front":
				if(front==back)
					System.out.println("-1");
				else
					System.out.println(deque[front]);
				break;
			case "back":
				if(front==back)
					System.out.println("-1");
				else
					System.out.println(deque[back-1]);
				break;
			}
		}
	}
}
package no1406;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner input=new Scanner(System.in);
		LinkedList list=new LinkedList<String>();
		String s=input.next();
		for(int i=0;i<s.length();i++) 
			list.add(s.charAt(i));
		input.nextLine();
		int n=input.nextInt();
		ListIterator iterator=list.listIterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		for(int i=0;i<n+1;i++) {
			s=input.nextLine();
			String[] array=s.split(" ");
			switch(array[0]) {
			case "L":
				if(iterator.hasPrevious())
					iterator.previous();
				break;
			case "D":
				if(iterator.hasNext())
					iterator.next();
				break;
			case "B":
				if(iterator.hasPrevious()) {
					iterator.previous();
					iterator.remove();
				}
				break;
			case "P":
				iterator.add(array[1]);
				break;
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
}

package no1966;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String result="";
		input.nextLine();
		for(int i=0;i<n;i++) {
			LinkedList<Integer> list=new LinkedList<>();
			int num=0;
			String s=input.nextLine();
			String[] array=s.split(" ");
			s=input.nextLine();
			String[] importance=s.split(" ");
			for(String k:importance) 
				list.add(Integer.parseInt(k));
			ListIterator iterator=list.listIterator();
			int refer=list.get(Integer.parseInt(array[1]));
			int max=list.get(Integer.parseInt(array[1]));
			int index=Integer.parseInt(array[1]);
			for(int j=0;j<list.size();j++) {
				if(max<list.get(j)) {
					max=list.get(j);
					index=j;
				}
			}
			System.out.println("index:"+index);
			for(int q=index;q<list.size();q++) {
				if(list.get(q)==refer)
					num++;
			}
			for(int w=0;w<Integer.parseInt(array[1]);w++) {
				if(refer==list.get(w))
				num++;
			}
			System.out.println(num+1);
			max=list.get(Integer.parseInt(array[1]));
			index=Integer.parseInt(array[1]);
			for(int j=0;j<list.size();j++) {
				if(max<list.get(j) && list.get(j)>refer) {
					max=list.get(j);
					index=j;
					num++;
				}
			}
			if(list.size()==1)
				System.out.println(num);
			else
				System.out.println(num+1);
		}

	}
}

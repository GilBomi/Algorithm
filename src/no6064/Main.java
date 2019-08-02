package no6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(reader.readLine());
		for(int i=0;i<k;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			int m=Integer.parseInt(token.nextToken());
			int n=Integer.parseInt(token.nextToken());
			int x=Integer.parseInt(token.nextToken());
			int y=Integer.parseInt(token.nextToken());
			int end=최소공배수(m,n);
//			LinkedList<Integer> xList=new LinkedList<>();
//			LinkedList<Integer> yList=new LinkedList<>();
			boolean result=false;
			for(int j=0;m*j+x<=end;j++) {
//				xList.add(m*j+x);
				if((m*j+x-y)%n==0) {
					System.out.println(m*j+x);
					result=true;
					break;
				}
			}
			if(!result)
				System.out.println("-1");
//			for(int j=0;n*j+y<=end;j++) {
//				yList.add(n*j+y);
//			}
//			ListIterator iterator=xList.listIterator();
//			boolean result=false;
//			while(iterator.hasNext()) {
//				int p=(int) iterator.next();
//				if(yList.contains(p)) {
//					System.out.println(p);
//					result=true;
//					break;
//				}
//			}
//			if(!result)
//				System.out.println("-1");
		}
	}
	public static int 최대공약수(int m,int n) {
		while(n!=0) {
			long t=m%n;
			m=(int)n;
			n=(int)t;
		}
		return m;
	}
	public static int 최소공배수(int m,int n) {
		return m*n/최대공약수(m,n);
	}
}

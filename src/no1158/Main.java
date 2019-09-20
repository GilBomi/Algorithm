package no1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int k=Integer.parseInt(token.nextToken());
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=1;i<=n;i++)
			list.add(i);
		String result="<";
		int index=k-1;
		
		while(true) {
			if(list.size()==0)
				break;
			if(index>=list.size())	
				index=index%list.size();
			result+=list.remove(index);
			result+=",";
			index+=k-1;
		}
		System.out.println(result.substring(0,result.length()-1)+">");

	}
}


package baekjoon.no5430;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			boolean result=true;
			String s=input.nextLine();
			int num=input.nextInt();
			
			input.nextLine();
			String element=input.nextLine();
			element=element.substring(1, element.length()-1);
			String[] array=element.split(",");
			List<String> list2=Arrays.asList(array);
			List<String> list=new LinkedList<>();
			list.addAll(list2);
			if(num==0) {
				System.out.println("error");
				continue;
			}
			for(int k=0;k<s.length();k++) {
				Iterator<String> iterator=list.iterator();
				switch(s.substring(k, k+1)) {
				case "R":
					Collections.reverse(list);
					break;
				case "D":
					if(list.size()==0) {
						System.out.println("error");
						result=false;
						break;
					}
					iterator.next();
					iterator.remove();
					break;
				}
			}
			if(!result)
				continue;
			System.out.println(Arrays.toString(list.toArray(new String[list.size()])));
		}
		
	}
}

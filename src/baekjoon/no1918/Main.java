package baekjoon.no1918;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Stack<String> signStack=new Stack<>();
		String s=input.nextLine();
		String result="";
		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("+") || s.substring(i,i+1).equals("-")) {
				if(signStack.size()==0) {
					signStack.push(s.substring(i,i+1));
				} else {
					signStack.push(s.substring(i,i+1));
					while(true) {
						if(signStack.size()==0)
							break;
						result+=signStack.pop();
					}
				}
			} else if(s.substring(i,i+1).equals("*") || s.substring(i,i+1).equals("/")) {
				signStack.push(s.substring(i,i+1));
			} else if(s.substring(i,i+1).equals(")") && signStack.size()!=0)
				result+=signStack.pop();
			else if(s.substring(i,i+1).equals("("));
			else 
				result+=s.substring(i,i+1);
		}
		System.out.println(result);
		
	}
}

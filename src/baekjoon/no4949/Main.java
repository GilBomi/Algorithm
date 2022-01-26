package baekjoon.no4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s="";
		while(true) {
			Stack<String> stack=new Stack<>();
			s=input.nextLine();
			if(s.equals("."))
				break;
			boolean result=true;
			for(int i=0;i<s.length();i++) {
				switch(s.substring(i, i+1)) {
				case "(":
				case "[":
					stack.push(s.substring(i,i+1));
					break;
				case ")":
					if(stack.size()==0) 
						result=false;
					else if(!stack.pop().equals("("))
						result=false;
					break;
				case "]":
					if(stack.size()==0) 
						result=false;
					else if(!stack.pop().equals("["))
						result=false;
					break;
				}
				if(!result) 
					break;
			}
			if(result && stack.size()==0 )
				System.out.println("yes");
			else 
				System.out.println("no");
		}
	
	}		
}

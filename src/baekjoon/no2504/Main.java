package baekjoon.no2504;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Stack<String> stack=new Stack<>();
		String s=input.nextLine();
		String pre=s.substring(0,1);
		boolean result=true;
		for(int i=1;i<s.length();i++) {
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
		if(result && stack.size()==0) 
			System.out.println();
		else
			System.out.println("0");
	}
}

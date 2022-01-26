package baekjoon.no2981;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(reader.readLine());
			array[i]= Integer.parseInt(token.nextToken());
		}
		int max=최댓값(array);
		int 공약수=공약수(array);
		int[] result=new int[n];
		for(int i=1;i*공약수<=max;i++) {
			for(int j=0;j<array.length;j++ ) {
				result[j]=array[j]%(i*공약수);
			}
			if(!비교(result))
				continue;
			else {
				if(i*공약수!=1)
					System.out.print(i*공약수+" ");
			}
		}
	}
	public static int 공약수(int[] array) {
		long a=array[0];
		long b=array[1];
		while(b!=0 ) {
			long t=a%b;
			a=b;
			b=t;
		}
		long result=a;
		if(array.length>=3) {
			for(int i=2;i<array.length;i++) {
				long c=array[i];
				while(c!=0) {
					long t=result%c;
					result=c;
					c=t;
				}
			}
		}
		return (int)result;
	}
	public static int 최댓값(int[] array) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	public static boolean 비교(int[] array) {
		boolean result=true;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1])
				return false;
		}
		return true;
	}
}

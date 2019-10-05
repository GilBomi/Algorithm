package no11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(reader.readLine());
		int result=0;
		for(int i=0;i<=n;i++) {
			for(int j=0;2*j<=n;j++) {
				for(int k=0;2*k<=n;k++) {
					if(i+j*2+k*2==n) {
						result+=factorial(i+j+k)/(factorial(i)*factorial(j)*factorial(k));
						
					}

				}
			}
		}

		System.out.println(result%10007);
	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		if (n <= 1)
			return n;
		else 
			return factorial(n-1)*n;

	}
}

// 무지의 먹방 라이브
package book.greedy3_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s=reader.readLine().split(" ");
	
	}
	public int solution(int[] food_times, long k) {
		int idx=0;
		for(int time=0;time<k;time++) {
			// food_times의 값이 모두 0이면 -1리턴
			int zeroNum=0;
			while(true) {
				if(food_times[idx%food_times.length]!=0) {
					food_times[idx%food_times.length]--;
					break;
				} else {
					zeroNum++;
				}
				if(zeroNum==food_times.length) {
					System.out.println("-1");
					return;
				}
				idx++;
			}
        }
		return idx%food_times.length+1;
    }
}

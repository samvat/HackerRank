package AlgoTrack;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i=0;i<N;i++){
			if(i==N-i){
				System.out.print("#");
			}
			else
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}

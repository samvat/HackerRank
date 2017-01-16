import java.util.Scanner;

public class DiagonalDifference {
	public static int absoluteDifference = 0;
	public static int sumDiagonal1 = 0;
	public static int sumDiagonal2 = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][] a = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				a[i][j] = scanner.nextInt();
			}
		}
		sumDiagonals(a, N);
		System.out.println(absoluteDifference);
		
		scanner.close();

	}
	private static void sumDiagonals(int[][] a, int N) {
		for(int i=0;i<N;i++){
			sumDiagonal1 = sumDiagonal1 + a[i][i];
			sumDiagonal2 = sumDiagonal2 + a[i][N-i-1];
		}
		absoluteDifference = Math.abs(sumDiagonal1 - sumDiagonal2);
	}

}

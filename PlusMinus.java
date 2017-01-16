import java.util.Scanner;

public class PlusMinus {
	public static float positive = 0;
	public static float negative = 0;
	public static float neutral = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++){
				a[i] = scanner.nextInt();
		}
		count(a, N);
		System.out.printf("%3f \n", positive/N);
		System.out.printf("%3f \n" , negative/N);
		System.out.printf("%3f \n", neutral/N);
		scanner.close();

	}
	private static void count(int[] a, int N) {
		for(int i=0;i<N;i++){
			if(a[i]==0){
				neutral+=1;
			} else if(a[i] > 0){
				positive+=1;
			} else if(a[i]< 0){
				negative+=1;
			}
		}
	}
}

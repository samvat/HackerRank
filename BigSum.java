import java.util.Scanner;

	public class BigSum {
		public static long sum = 0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();
			if((N>=1)&&(N<=10)){
				long[] a = new long[N];
				for(int i=0;i<N;i++){
					a[i] = scanner.nextInt();
				}
				add(a);
				
			}
			System.out.println(sum);
			
			scanner.close();
		}

		private static void add(long[] a) {
			// TODO Auto-generated method stub
			
			for(int i=0;i<a.length;i++){
				sum = sum + a[i];
			}
		}

	}

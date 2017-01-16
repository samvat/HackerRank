import java.util.Scanner;

public class Compare {
	public static int alice = 0;
	public static int bob = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for(int i=0;i<3;i++){
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<3;i++){
			b[i] = scanner.nextInt();
		}
		score(a,b);
		System.out.printf("%d %d", alice,bob);
		scanner.close();
	}
	private static void score(int[] a, int[] b) {
		for(int i=0;i<3;i++){
			if(a[i]==b[i]){
				alice += 0;	
			} else if(a[i]>b[i]){
				alice += 1;
			} else if(a[i]<b[i]){
				bob +=1;
			}
		}
		
	}

}

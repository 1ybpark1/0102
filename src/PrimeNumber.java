import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int k = 2; k < n; k++) {
			if(n%k == 0) {
				isPrime = false;
				break;
			}
			System.out.println(k);
		}
		
		if(isPrime) System.out.println(n + " is prime number.");
		else System.out.println(n + " is NOT prime number.");
	}
}

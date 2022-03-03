import java.util.Scanner;
public class Ex8 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex8(sc);
		}
		
	
	public static void Ex8(Scanner sc) {
		System.out.println("Introduceti numarul");
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial de " +n + " este " + factorial);
}

		
	}


import java.util.Scanner;
public class Ex7 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex7(sc);
		}
		
	
	public static void Ex7(Scanner sc) {
		System.out.print("Numar de numere: ");
		int n = sc.nextInt();
		int suma = 0;
		int result = 0;
		
	for (int i = 1; i<=n; i++) {
		System.out.print("Optiunea ta");
		int optiunea_ta = sc.nextInt();
			suma = suma + optiunea_ta;
	}
	result = suma / n;
	System.out.println("Result: " + result);

	    }
		
	}


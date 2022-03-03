import java.util.Scanner;
public class Ex6 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex6(sc);
		}
		
	
	public static void Ex6(Scanner sc) {
		System.out.print("Introduceti numarul: ");
		int n = sc.nextInt();
		int suma = 0;
		
	for (int i = 1; i<=n; i++) {
		if (i%2 != 0) {
			
			suma = suma + i;
		}
	}
	System.out.println("Suma: " + suma);
	    }
		
	}


import java.util.Scanner;
public class Ex4 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex4(sc);
		}
		
	public static void Ex4(Scanner sc) {
		System.out.println("Introduceti trei numere: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
	if (n1<n2 && n1<n3)
		System.out.println(" min: " + n1);
	
	else if (n2<n1 && n2<n3)
		System.out.println(" min: " + n2);
	
	else if (n3<n2 && n3<n1)
		System.out.println(" min: " + n3);
	

	    }
		
	}


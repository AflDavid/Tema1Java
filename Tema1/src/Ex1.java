import java.util.Scanner;
public class Ex1 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex1(sc);
		}
		
	public static void Ex1(Scanner sc) {
		System.out.println("Introduceti nota");
			int n = sc.nextInt();
		if (n>=5)
			System.out.println("ADMIS");
		else if (n<=5 && n >=1)
			System.out.println("RESPINS");
		if (n<1 || n>10)
			System.out.println("INVALID");

	    }
		
	}


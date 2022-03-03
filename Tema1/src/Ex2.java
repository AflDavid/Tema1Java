import java.util.Scanner;
public class Ex2 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex2(sc);
		}
		
	public static void Ex2(Scanner sc) {
		System.out.print("Introduceti numarul: ");
		byte n = sc.nextByte();
		switch (n) {
		
		case 1:
			System.out.println("unu");
			break;
			
		case 2:
			System.out.println("doi");
			break;
			
		case 3:
			System.out.println("trei");
			break;
			
		case 4:
			System.out.println("patru");
			break;
			
		case 5:
			System.out.println("cinci");
			break;
			
		default:
			System.out.println("INVALID");
			break;

	    }
	}
}


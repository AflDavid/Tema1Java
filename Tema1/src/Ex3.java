import java.util.Scanner;
public class Ex3 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex3(sc);
		}
		
	
	public static void Ex3(Scanner sc) {
		System.out.println("Introduceti numarele: ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
		if (n1%2 == 0 && n2%2 ==0)
			System.out.println("Produs" + n1*n2);
		
		else if (n1%2 != 0 && n2%2 !=0) {
			
			
			int Media = (n1+n2)/2;
			System.out.println("Media: " + Media);
		}
			
		else 
			System.out.println("Suma: " + n1+n2);
			 
		

	    }
		
	}


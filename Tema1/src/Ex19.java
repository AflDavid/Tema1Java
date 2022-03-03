import java.util.Scanner;
public class Ex19 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex19(sc);
		}
		
	
	public static void Ex19(Scanner sc) {
			System.out.println("Scrieti un numar: ");
			int num = 0;
	        int reversenum = 0;
	        num = sc.nextInt();
	        while (num != 0) {
	            reversenum = reversenum * 10;
	            reversenum = reversenum + num % 10;
	            num = num / 10;
	        }

	        System.out.println (+ reversenum);
	    }
		
	}


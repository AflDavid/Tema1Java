import java.util.Scanner;
public class Ex10 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Ex10();
		}
	public static boolean Ex9(int n) {
		boolean set = true;
		if (n % 2 == 0) {
			return set;
		}
		for (int dvz = 3; dvz <= Math.sqrt(n); dvz++) {
			if (n % dvz == 0) {
				set = false;
				break;
			}
			dvz++;
		}
		if(set)
			System.out.println("N este prim");
		else
			System.out.println("N nu este prim");
		return set;
	}
		
	

	public static void Ex10() {
		int n = 1001;
		while(true) {
			if (Ex9(n)) {
				System.out.println("Numarul este prim: " + n);
				break;
			}
			n = n + 2;
		}
	}

	}


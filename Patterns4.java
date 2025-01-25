
public class Patterns4 {

	public static void main(String[] args) {

		for (int r = 1; r <= 10; r++) {
			for (int k = 1; k <= 20; k++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 15; c++) {
				if ((r == 1) || (r == 10)) {
					System.out.print("*");
				} else {
					if ((c == 1) || (c == 15)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}


public class Patterns2 {

	public static void main(String[] args) {
		
		
		for(int r=1;r<=5;r++) {
			for(int c=5;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		/*for(int r=5;r>=1;r--) {
			for(int c=1;c<=r;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
			
			output: 1 2 3 4 5
					1 2 3 4
					1 2 3
					1 2
					1
		}*/

	}

}

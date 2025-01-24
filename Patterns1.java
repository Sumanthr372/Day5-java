
public class Patterns1 {

	public static void main(String[] args) {
		
		for(int r=5;r>=1;r--) {
			for(int c=5;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		// or

		
		/*for(int r=1;r<=5;r++) {
			for(int c=5,p=1;p<=r;c--,p++) {           //or for(int c=1;c<=r;c++) (output 12345
			 																			 1234
			 																			 123
			 																			 12
			 																			 1)
		/*for(int r=1;r<=5;r++) {
			for(int c=5,p=1;p<=r;c--,p++) {												 
				System.out.print(c+" ");
			}
			System.out.println();
		}*/
		
		
		
		

	}

}
//
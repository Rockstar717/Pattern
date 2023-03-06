package pattern;

public class Diamond {

	public static void main(String[] args) {
	/*	for (int i = 5 ; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(j+1);
			}
				System.out.println("");
			}*/
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" 5");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 3; j >= i; j--) {
				System.out.print(" 4");
			}
			System.out.println();
		}
	}
}
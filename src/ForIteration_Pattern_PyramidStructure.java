
public class ForIteration_Pattern_PyramidStructure {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5 ; i++) {
			
			for (int T1 = 4; T1 >=i; T1--) {
				
			System.out.print(" ");
				
			}
			
		for (int T2 = 1; T2 < i; T2++) {
			
			System.out.print(T2);
		}
		
		for (int T3 = 1; T3 <=i; T3++) {
			
			System.out.print(T3);
		}
		
		for (int T4 = 4; T4 >= i; T4--) {
			System.out.print(" ");
		}
		
			System.out.println();
		}
		
		
	}
}


public class ForIteration_Pattern2 {

	public static void main(String[] args) {
		
		for (int i = 1; i<= 3; i++) {
			
			for (int j = 1; j < i ; j++) {
				
					System.out.print("@");
				}
					
				for (int j2 = 3; j2 >=i; j2--) {
					
					System.out.print("#");
						
					}
					
				System.out.println();
				} 
			
		System.out.println("___________");
		
			for (int i = 1; i<= 3; i++) {
			
			for (int j = 2; j >= i ; j--) {
				
					System.out.print("@");
				}
					
				for (int j2 = 1; j2 <=i; j2++) {
					
					System.out.print("#");
						
					}
				
				System.out.println();
				} 
				
		System.out.println("___________");
				
				for (int i = 1; i<= 3; i++) {
					
				for (int j = 1; j <= i ; j++) {
						
					System.out.print("#");
					
				}
							
				for (int j2 = 2; j2 >=i; j2--) {
							
							System.out.print("@");
								
							}
							
						System.out.println();
				
			}
			
				System.out.println("___________");
				
				for (int i = 1; i<= 3; i++) {
					
				for (int j = 3; j >= i ; j--) {
						
					System.out.print("#");
					
				}
							
				for (int j2 = 1; j2 <i; j2++) {
							
							System.out.print("@");
								
							}
							
						System.out.println();
				
			}
	
	}
}

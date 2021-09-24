package Activitat1;

public class Act1_5 {
	
	public int mayores(int[]n) {
		
		int cont = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			int aN = n[i];
			
			if(aN > cont) {
				
				cont = aN;
				
			}
			
		}
		
		return cont;
		
	}

}

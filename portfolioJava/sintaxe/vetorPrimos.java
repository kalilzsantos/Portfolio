import java.util.Random;
import java.util.Scanner;

 
public class vetorPrimos { 
	
	static Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
	
	public static int resultado(){
		int primo = 0;
		System.out.print("\nDigite o numero de lugares no vetor: ");
		int v = teclado.nextInt();
        int n[] = new int [v];
        		
        for (int i = 0; i < n.length; i++) {    
            System.out.print("Digite o " + (1 + i) + "º numero"); 
            n[i] = teclado.nextInt();
        }
         
        for (int i = 0; i < n.length; i++) {        	
            if( primo(n[i])){
                System.out.println(n[i] + " é primo. Posição no vetor: " + (1+i));
        } 
      }

        
		return primo;
	}
	    
        private static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    	}
	  
}


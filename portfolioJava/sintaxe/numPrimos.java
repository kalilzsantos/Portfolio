import java.util.Random;
import java.util.Scanner;

public class numPrimos {
	
	static Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
    
    public static int np;
    public static String resultado;
    
    public static String verifica() {
    	System.out.print("\nDigite o valor: ");
		int np = teclado.nextInt();
		resultado = "primo";
    	for (int j = 2; j < np; j++) {
    	     if (np % j == 0){
    	        resultado = "N�o � primo!!";
    	     }if(resultado != "N�o � primo!!"){
    	    	 resultado = "� primo!!";
    	     }
    	}
    	System.out.printf("\nResultado: %s", resultado);
    	return resultado;
    }

}

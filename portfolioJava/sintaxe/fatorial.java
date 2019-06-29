import java.util.Scanner;
import java.util.Random;

public class fatorial {
	
	static Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
	
	public int numeros;
	
	

	public static int geraFat() {
		System.out.print("Digite um valor: ");
		int n1 = teclado.nextInt();
		int fat = 1;
		for(int i = n1; i>0;i--) {
			fat = fat * i ;
		}
		int resultado = fat;
		System.out.printf("\nResultado do fatorial: %d", resultado);
		
		return fat;
	}

}
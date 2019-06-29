import java.util.Scanner;
import java.util.Random;

public class valorFut {
	
	static Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
	
		public double VF;
		
		public static float conta() {
			System.out.print("\nDigite o valor: ");
			float vp = teclado.nextFloat();
			System.out.print("Digite a taxa de juros(em porcentagem): ");
			float i = teclado.nextFloat();
			System.out.print("Digite a quantidade de meses: ");
			float n = teclado.nextFloat();
			
			i = i/100;
			float vf =(float) (vp*(Math.pow(1+i, n)));
			
			System.out.printf("\nO valor a pagar é: %.2f", vf);
			
			return vf;
		}
}
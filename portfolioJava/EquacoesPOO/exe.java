import java.util.Scanner;
import java.util.Random;

public class exe {
	
	static Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
	
    
    public static boolean  teste;
    public static boolean  zero;

	
	public static boolean isPositivo(double num) {
		System.out.print("Digite um valor: ");
		num = teclado.nextDouble();
		if(num > 0) {
			System.out.printf("� positivo!!!\n ");
			return true;
		}else {
			System.out.printf("� negativo!!!\n ");
			return false;
		}
	}
	
	
	public static boolean isZero(double num) {
		System.out.print("Digite um valor: ");
		num = teclado.nextDouble();
		if(num == 0) {
			System.out.printf("� zero!!!\n ");
			return true;
			
		}else {
			System.out.printf("N�o � zero!!!\n ");
			return false;
		}
	}
	
	public static double delta(double a, double b, double c ) {
		System.out.print("Digite um valor de a: ");
		a = teclado.nextDouble();
		System.out.print("Digite um valor de b: ");
		b = teclado.nextDouble();
		System.out.print("Digite um valor de c: ");
		c = teclado.nextDouble();
		double delta = Math.pow(b, 2)-4*a*c;
		System.out.printf("O resultado do delta �: " + delta + "\n");
		return delta;
	}

	public static double equaSegundo(double a, double b, double c ) {
		System.out.print("Digite um valor de a: ");
		a = teclado.nextDouble();
		System.out.print("Digite um valor de b: ");
		b = teclado.nextDouble();
		System.out.print("Digite um valor de c: ");
		c = teclado.nextDouble();
		double delta = Math.pow(b, 2)-4*a*c;
		System.out.printf("O resultado do delta �: " + delta + "\n");
	    System.out.println("Resolu��o da F�rmula de B�skara: " + (delta));

	    System.out.println("");

	    //F�rmula Geral da Equa��o de segundo grau.
	    System.out.println("Resultados das ra�zes: ");
	    if (delta > 0 && a>0){ 
	    	int r1 = (int) ((-b + Math.sqrt(delta)) / (2*a));
            System.out.println("A 1� ra�z �: " + r1);
            int  r2 = (int) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("A 2� ra�z �: " + r2);
	        
	    }
	        else {
	        	System.out.println("N�o existe ra�z real, Delta < ou = 0 ou a = 0");

	        }
	    return delta ;
	    }
	
	public TemperaturaCels() {
        System.out.println("Entre com a temperatura Farenheit: ");
        setCels(sc.nextInt());
        System.out.println("A Temperatura convertida para Celsius � de: " + getCels());
    }
    public int getCels() {
        return cels;
    }
    public void setCels(int cels) {
        this.cels = (cels - 32) * 5 / 9;
    }

	
	public TemperaturaFah() {
    System.out.println("Entre com a temperatura Celsius: ");
    setFah(teclado.nextInt());
    System.out.println("A Temperatura convvertida � de: " + getFah());
	}
	public int getFah() {
		return fah;
	}
	public void setFah(int fah) {
		this.fah = (9.C/5) + 32
	}
	
	public Menu(){
		
	}
	
	
	
	
	
	}


import java.util.Scanner;

public class CalculoIMC{
	
   private static Scanner ler;


public static void main(String[] args) 
   {
      ler = new Scanner(System.in);
      String nome;
      float peso, altura;
      float imc;
      String classifica;
 
      System.out.println("Nome da Pessoa: ");
      nome = ler.nextLine();
      System.out.println("Peso da Pessoa (kg): ");
      peso = ler.nextFloat();
      System.out.println("Altura da Pessoa (m): ");
      altura = ler.nextFloat();
      ler.nextLine();
 
 
      imc = calcularIMC(peso,altura);
 
 
      classifica = resultadoIMC(imc);
      
 
      System.out.printf("IMC da Pessoa = %.1f - %s\n",imc,classifica);
     
   	}
 
   static float calcularIMC(float p, float h)
   {
      return p/(h*h);
   }


   static String resultadoIMC(float imc)
   {
      String result;
      if (imc <= 19)
         result = "Abaixo do Peso";
      else
         if (imc <= 25)
            result = "Peso ideal";
         else
            if (imc <= 30)
               result = "Acima do Peso";
            else
               if (imc <= 35)
                  result = "Obesidade Leve";
               else
                  result = "Obesidade"; 
      
      return result;
   }

}

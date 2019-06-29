
public class exes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		fatorial fat = new fatorial();
		valorFut VF = new valorFut();
		numPrimos np = new numPrimos();
		vetorPrimos pv = new vetorPrimos();
		vetorAlea vl = new vetorAlea();
		
		//chama a classe Fatorial
		fat.geraFat();
		
		//chama a classe de Valor a pagar
		VF.conta();
		
		//chama a classe que Verifica se o numero é primo
		np.verifica();
		
		//chama a classe que Verifica se os numeros do vetor são primos
		pv.resultado();
		
		//chama a classe  que gera um Valor aleatório
		vl.numAleatorio();


	}

}
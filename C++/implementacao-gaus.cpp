/*	Alunos:
		Giovanni Delli Colli da Silva		RA: 2051370
		Henrique Ferreira Evaristo Alves	RA: 2051672
		Luiz Felipe Martins Marvulle		RA: 2051451
*/

//	Método: Método iterativo de Gauss-Seidel com critério de convergência de Sassenfeld.
//  Via moodle, enviar arquivo .c ou .cpp com o código implementado.


#include <stdio.h>			//  ---
#include <stdlib.h>			//    |----> Introduzir biblioteca de dados;
#include <math.h>			//	  |
#include <string.h>			//  ---


int main() {
	
	int incognitas,linha,coluna;
	
	printf("Digite o numero de incognitas que o sistema possui: ");	//identifica o tamanho da matriz tanto das incognitas quanto dos termos independentes
	scanf ("%d",&incognitas);
	
	float x0[incognitas];			//introduz a matriz soluçao inicial
	float x1[incognitas];			//intorduz a matri solução calculada
	
	for (int i=0;i<=incognitas;i++){		//atribui o valor 0 para as incognitas para calcular a primeira iteração
		x0[i]=0;
		x1[i]=0;
	}

	linha = incognitas;
	coluna = incognitas;
	
	float matrizA[linha][coluna], matrizB[linha];	//matrizA = coeficiente das incognitas; matrizB = termos independentes
	
	for (int i=1; i<=linha; i++){								//recebe os coef. das incognitas
		printf("\n");
		for (int j=1; j<=coluna; j++){
			printf ("Escreva o coeficiente a%d%d: ",i,j);
			scanf ("%f",&matrizA[i][j]);
		}
	}	
	
	printf ("\n");
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////*********mudei aqui, o i deve iniciar no 0, já que ele esta funcionando como parametro da matrizB e ela foi definida como matrizB[linha]. O laço for que tinha o j, tbm nao precisa, o j sempre correspondia ao numero 1, entao no print ao inves de colocar o j, coloca o 1, dai economiza.
	for (int i=0; i<linha; i++){							//recebe os termos independentes
			printf ("Escreva o termo independente b%d%d: ",i+1,1);
			scanf ("%f",&matrizB[i]);
	}
	
	
	//Depois de introduzido o sistema, analisar se converge ou se não converge
	
	//	SE B = max {Bi} < 1  ---> converge
	//     Bi = (1/|aii|) * [somatorio(|aij (j!=i e j<i)| * Bi) + somatorio (|aij (j!=i e j>i|)]
	
	float B, Bi[incognitas], soma[incognitas];
	
	for (int i=1;i<=incognitas;i++){
		soma[i]=0;
		for (int j=1;j<=incognitas;j++){
			if(i!=j){								//analise para ver se o elemento é da diagonal principal
				if(i<j){							//Se j>i entra no somatorio (|aij (j!=i e j>i|)
					soma[i]+=fabs(matrizA[i][j]);
				}
				else{								//Se j<i entra no somatorio(|aij (j!=i e j<i)| * Bi)
					soma[i]+=fabs(matrizA[i][j]*Bi[j]);
				}
			}
		}
		Bi[i]=(soma[i]/fabs(matrizA[i][i]));		//Bi recebe o valor da linha feita para ser utilizado na linha seguinte
	}
	
	B=Bi[1];
	
	for (int i=1;i<=incognitas;i++){			//analisa os valores calculados de cada linha, armazenando em B o valor maximo de Bi
		if(B<Bi[i]){
			B=Bi[i];
		}
	}
	
	if (B<1){
		printf ("\nO metodo de Gauss-Seidel converge.");		//caso o sistema tenha convergencia o programa continua
	}
	else{
		printf("\nO metodo de Gauss-Seidel nao converge.");		//caso o sistema nao tenha convergencia o programa finaliza
		return 0;
	}
	
	//Caso tenha convergencia o programa comeca a calcular os valores de x
	//xi = (1/aii) * (bi - somatorio(aij * xj)(j>i) - somatorio(aij * xj)(j>i)
	//essa operação deve ser feita ate que o erro seja aceitavel
	
	float erro=0;
	printf ("\n\nDigite o valor do erro para calcular a solucao do sistema: ");
	scanf ("%f",&erro);
	
	//entra uma função do{}while(calculoerro>erro)
	
	float calculodoerro=1, somatorio1,somatorio2 ,max0=0, max1=0;
		
	do{
		for (int i=1;i<=incognitas;i++){						//laço que calcula as solucoes do sistema
			somatorio1=0;
			somatorio2=0;
			for (int j=i;j<i;j++){
				somatorio1+=matrizA[i][j]*x0[j];
			}
			for (int j=i+1;j<=incognitas;j++){
				somatorio2+=matrizA[i][j]*x1[j];
			}
			x1[i]=((1/(matrizA[i][i]))*(matrizB[i]-somatorio1-somatorio2));
		}
		
		//calculodoerro = (max0 |x1[i] - x0[i]|) / (max1 |x1[i]|)
		
		for (int i=0;i<incognitas;i++){
			float a=0,b=0;
			a=(x1[i]-x0[i]);
			b=x1[i];
			if (max0>fabs(a)){
				max0=fabs(a);
			}
			
			if(max1 > fabs(b)){
				max1 = fabs(b);
			}
		}
		calculodoerro=(max0/max1);
		
		
		for(int i=0;i<incognitas;i++){
			x0[i] = x1[i];
		}
		
	}while(calculodoerro>erro);
	
	for (int i=0;i<incognitas;i++){
		printf("\nx%d e %f",i+1,x1[i]);
	}
	
	printf("\nCom erro de %f",calculodoerro);
	
	return 0;
}

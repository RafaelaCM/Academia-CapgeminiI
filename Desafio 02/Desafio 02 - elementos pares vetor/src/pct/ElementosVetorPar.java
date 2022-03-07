package pct;

import java.util.Scanner;

public class ElementosVetorPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		int n=0;
		//Definindo valor x
		Scanner ler = new Scanner(System.in);
		System.out.print("Defina o 'X' :   "); 
		x=ler.nextInt(); 
		System.out.print("X =  " + x);
		
		//Definindo tamanho do vetor
		//Scanner ler = new Scanner(System.in);
		System.out.print("\nQuantidade de elementos no vetor "); 
		n=ler.nextInt(); 
		System.out.print("\nElementos vetor :    " + n);
		
		//preenchendo o vetor
		int[] vetor = new int[n];  
		System.out.println("\nInsisra os elementos dentro do vetor:");  
		for(int i=0; i<n; i++)  
		{     
			vetor[i]=ler.nextInt(); //reads elements from the user 
		}  
		
		
		//criando condição para a diferença entre os numeros do vetor sejam igual a x
		int contador=0;
		for(int i=0 ; i<n; i++) {
			for(int j=0 ; j>=0; j--) {
				if(vetor[i] - vetor[j] == x && vetor[i] - vetor[j] %2 == 0){
					contador ++ ;
				}
				
			}
		}
		//Imprimindo valor
		System.out.print("\nNumero final = " + contador);
	}

}

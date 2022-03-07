package pck;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CalcMediana {

	public static void main(String[] args) {
		// Garante que a quantidade de numeros analisados seja ímapr
		System.out.println("Digite o tamanho do seu vetor ");
		Scanner leitura = new Scanner(System.in);
		int n = leitura.nextInt();
		
		int arr[] = new int[n];
		int i;
		int m;
	    
		do {
			
			System.out.println("Preencha o seu vetor ");
			for (i = 0; i < arr.length; i++)
		    {
		        arr[i]=leitura.nextInt();
		    }
			
			//Imprime vetor arr
			System.out.println(Arrays.toString(arr));
			
			//Faz o calculo de onde vai estar a posição da mediana
			m = (Array.getLength(arr) - 1)/2;
			System.out.println("A mediana é :   " + arr[m]);

		}while(n%2 == 0); // Executa o programa enquanto o número de itens no vetor seja ímpar
				
	}
}

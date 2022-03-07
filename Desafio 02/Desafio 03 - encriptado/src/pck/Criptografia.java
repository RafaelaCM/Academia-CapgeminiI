package pck;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {

		int caracter = 0;
	    String frase ;
	    
	    //Pede ao usuário para inserir frase e armazena informação na variável frase
		Scanner ler = new Scanner(System.in);
	    System.out.println("Informe frase que devera ser encriptada:\n");
	    frase = ler.nextLine();
	    //Tira os espaços da frase para não contabilizar no número de elementos 
	    frase = frase.replace(" ", "");
	    String words[] = frase.split("");
	    
	    //Contabiliza quantos caracteres a frase/mensagem possui
	    for(int i = 0; i < frase.length(); i++) {    
            if(frase.charAt(i) != ' ')    
            	caracter++;    
        } 
	    
	    //Realiza calculo da raiz da quantidade de caracteres e arredonda quando a raiz não é exata
	    double raiz = Math.sqrt(caracter);
	    int raizr = (int) Math.round(raiz);
	
	    //Define as dimensões da matriz de acordo com a raiz calculada acima
	    String matriz[][] = new String[raizr][raizr];
	    
	    //Loope para preencher a matriz com as dimensões da raiz de forma transposta
	    int apontador=0;
	    for (int i = 0; i < raizr; i++) {
	    	for(int j=0; j< raizr; j++) {
	    		if(apontador<words.length) {
	    			matriz[i][j] = words[apontador];
		    		apontador ++ ;
	    		}
	    		else
	    			matriz[i][j] = "";
	    	}
	    }
	    
	    //Imprime mensagem encriptada dando espaçamento 
	    for (int i = 0; i < raizr; i++) {
	    	for(int j=0; j< raizr; j++) {
	    		System.out.print(matriz[j][i]);
	    		}
	    	System.out.print(" ");
	    	
	}
	  
	    
	}}
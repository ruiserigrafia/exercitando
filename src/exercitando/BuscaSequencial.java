package exercitando;

import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        int n;
        System.out.println("Informe um numero:");
        n = leitor.nextInt();
        
        System.out.println(buscarNumero(n,elementos));

	}
	
	public static String buscarNumero(int n, int[] elementos) {                
        for (int i = 0;  i < elementos.length; i++) {
            if(elementos[i] == n) {
                return "Achei " + n + " na posicao " + i;
            }             
         }
         return "Numero " + n +" nao encontrado!";
    }

}

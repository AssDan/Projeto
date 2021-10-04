package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int QTD_NUMEROS = 10; //Constante não mudar de valor //
        int numero, pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° numero:" , i);
            numero = entrada.nextInt();

            if(numero % 2 == 0) {
                pares++;
            }
        }
        System.out.println("o total de pares é" + pares);
        System.out.println("o total de impares é" + (QTD_NUMEROS - pares));

        entrada.close();
    
    }
}


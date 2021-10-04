package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, maior; Object menor = ;

        
            maior = Integer.MIN_VALUE; 
            menor = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + i) + "° número:);"
            numero = entrada.nextInt();
            if (numero > maior) {
                maior = numero;
                
            }
            if (numero > maior) {
                maior = numero;
                
            }
            if (numero < menor) {
                menor = numero;
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        entrada.close();
    }    
}
package exercicios.exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        numero = -1;
        while (numero < 0) {
            System.out.println("Digite um número positivo");
            numero = entrada.nextInt();
            
        }
       entrada.close();
    }
}

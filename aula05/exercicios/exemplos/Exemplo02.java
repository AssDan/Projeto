package exercicios.exemplos;

import java.util.Scanner;

public class Exemplo02 {
    private static Object chances;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero; chances;

        chances = 3;

        do  {
            System.out.println("Digite um número positivo");
            numero = entrada.nextInt();
            chances--;
            
        } while (numero < 0 && chances > 0);
       entrada.close();
    }
}

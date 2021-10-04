package exercicios;

import java.io.PrintStream;

public class Exercicio01 {
    private static String numero;
    public static void main(String[] args) {
        System.out.println("Digite um valor inteiros");
       
    

        
    

    if(ehPar(numero)) {
        System.out.println(numero + " é par");
    } else {
        System.out.println(numero + " é impar");
    }
}
    static boolean ehPar(String numero2) {
        if( numero2 % 2 == 0) {
            
            return true;
           

        } else {
            return false;
        }


    }
}

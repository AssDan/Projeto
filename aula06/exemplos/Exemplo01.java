package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        linha();
        System.out.println("Meu Programa v.1");
        linha(); // chamada de método
        System.out.println("Opções");
        "Opções".length();
        linha(6);
        linha(20);
    }

    static void linha() { // void = não tem retorno
        System.out.println("-----------");

    }

    static void linha(int tamanho) { // tamanho é um parâmetro
        for(int i = 0; i < tamanho; i++){
        System.out.print("-");
    }
    System.out.println();
    }
}
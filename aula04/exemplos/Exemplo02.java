package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int a;

        a = 5;

        //pós-incremento
    System.out.println(a++); //usa a variável e depois soma
    System.out.println(a);

        // pré-incremento

        System.out.println(a++); // primeiro soma 1 na variável e usa a variável e depois soma
        System.out.println(a);
        ++a;
    }
    
}

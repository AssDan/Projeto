package exercicio03;

public class Veiculo {
    String modelo, marca;
    double consumo;

    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
   
    void exibir() {
        System.out.println("Modelo: " + modelo + "Marca: " + marca);
    }

    double obterConsumo() {
     return consumo;   
    }

}

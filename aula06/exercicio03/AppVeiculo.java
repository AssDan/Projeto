package exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Gol", "VW", 12.5);

        veiculo.exibir();
        veiculo.consumo = -7;
        System.out.println("Consumo:" + veiculo.obterConsumo());
        
    }
}

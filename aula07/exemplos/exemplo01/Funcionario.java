package exemplos.exemplo01;

public class Funcionario extends Object{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public void exibir() {
        System.out.println(nome + " - " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void aumentaSalario(double porcentagem) {
        salario = salario + salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return nome + ": R$ " + salario; 
    }

    
}

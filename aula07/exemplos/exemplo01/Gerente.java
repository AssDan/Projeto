package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;
 
        public Gerente (String nome, double salario, int numFuncionarios) {
            super(nome,salario);
            this.numFuncionarios = numFuncionarios;
        }

        public Gerente(String nome) {
            super(nome, 0);

        }

        public Gerente (double salario) {
            super("nome" , 0);
        }

        public void exibir() {
            System.out.println(getNome() + "-" + numFuncionarios);
        }

        @Override
        public void aumentaSalario(double porcentagem) {

            super.aumentaSalario(porcentagem + 20); ;
        }

        private String getNome() {
            return null;
        }
    }


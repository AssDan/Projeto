package exercicios;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int NUMEROS_ALUNOS = 3;
        double media, mediaTurma, mediaGeral;

        for (int turma = 1; turma <= NUMERO_TURMAS; turma++) {


            mediaTurma = 0;
            for(int alunos=1; alunos < NUMEROS_ALUNOS; alunos++) {
                System.out.println("Informe a média do aluno" + alunos);
                media = teclado.nextDouble();
                mediaTurma += media; 

        }
        mediaTurma /= NUMEROS_ALUNOS;
        System.out.println("Media da turma" %.2f\n , + mediaTurma);

        mediaGeral += mediaTurma;

    }

    mediaGeral /= NUMEROS_TURMAS;
    System.out.println("\nMédia Geral:" + mediaGeral);

              


        }

        MediaTurma /= NUMERO_ALUNOS;
        System.out.println("Média da turma" + mediaTurma);

        teclado.close();

        }

/*14. Escreva um código Java que lê a nota de um aluno e verifica se ele foi aprovado
ou reprovado. */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Notas abaixo de 60 pontos, são de alunos reprovados.\nQual a nota do aluno? ");
        nota = scanner.nextDouble();

        if (nota >=60) {
            System.out.println("Aprovado!!");
        }
        else{
            System.out.println("Se ferrou, vai ter que aguentar as listas do Daniel mais 4 meses!!");
        }

        scanner.close();
    }
}

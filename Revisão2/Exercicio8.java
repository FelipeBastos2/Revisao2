/*8. Escreva um código Java que verifica se um número é par ou ímpar. */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero");
        numero = input.nextInt();
        if (numero % 2==0) {
            System.out.println("É um numero par.");
        }
        else
        System.out.println("É um numero impar");

        input.close();;
    }
}

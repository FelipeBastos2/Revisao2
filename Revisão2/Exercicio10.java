/*Escreva um código Java que calcula o desconto de um produto com base em seu
valor original.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        double valorPorcent;
        double valorProdut;

        System.out.println("Digite o valor do produto: ");
        valorProdut = sacanner.nextDouble();

        System.out.println("Digite a porcentagem de desconto: ");
        valorPorcent = sacanner.nextDouble();

        double valorDescont = (valorPorcent /100)*valorProdut;

        double resultado = valorProdut -  valorDescont;

        System.out.println("Desconto de: "+valorDescont );
        System.out.println("Valor total com desconto: " +resultado );
        sacanner.close();
    }
}

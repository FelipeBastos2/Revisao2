/* Escreva um código Java que lê o salário de um funcionário e calcula o seu
imposto de renda. */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double imposto;

        System.out.println("Qual é o seu salário?");
        imposto = scanner.nextDouble();
        

        if (imposto >  2.112 || imposto< 2.826 ) {
            double impostoLight= 7.5;
            double soma1 = imposto*impostoLight / 100;
            System.out.println("Seu imposto de renda é de: "+"R$"+soma1);
        }

       else if (imposto > 2.826 || imposto < 3.751 ) {
            double impostoPlus= 15;
            double soma2 = imposto*impostoPlus / 100;
            System.out.println("Seu imposto de renda é de: "+"R$"+soma2);
        }

       else if (imposto > 3.751 || imposto> 4.664 ) {
            double impostoGourmet= 22.5;
            double soma3 = imposto*impostoGourmet / 100;
            System.out.println("Seu imposto de renda é de: "+"R$"+soma3);
        }

       else if (imposto > 4.664 ) {
            double impostoSupreme= 27.5;
            double soma = imposto*impostoSupreme / 100;
            System.out.println("Seu imposto de renda é de: "+"R$"+soma);
        }

        scanner.close();
    }
    
}

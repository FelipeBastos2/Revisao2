/*13. Escreva um código Java que lê três números e verifica qual é o maior.
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       int numero1;
       int numero2;
       int numero3;


    System.out.println("Digite o numero 1: ");
       numero1 = scanner.nextInt();

    System.out.println("Digite o numero 2: ");
        numero2 = scanner.nextInt();

    System.out.println("Digite o numero 3: ");
        numero3 = scanner.nextInt();
        if (numero1 > numero2 && numero1>numero3) {
            System.out.println("Maior numero: " +numero1);
        }
        else if( numero2 > numero1 && numero2>numero3)
        System.out.println("Maior numero: "+numero2);

        else if (numero3 > numero1 && numero3>numero2) {
            System.out.println("Maior numero: "+numero3);
        }

        scanner.close();

    }
}

/*9. Escreva um código Java que verifica se um usuário é maior de idade.
 */

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        
        if ( idade < 18) {
            System.out.println("Você é menor de idadee");
        }
        else
        System.out.println("Você é maior de idade.");
        scanner.close();
    }
}

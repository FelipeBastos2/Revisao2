/*11. Escreva um código Java que simula o jogo de pedra, papel e tesoura.
 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int  jogo ;
            int pedra =1;
            int papel =2;
            int tesoura =3;

        System.out.println("FAÇA SUA JOGADA:\n1-Pedra\n2-Papel\n3-Tesoura");
        jogo = scanner.nextInt();
        while(true){
            if (pedra > tesoura) {
                System.out.println("Voce ganhou");
            }
            scanner.close();
        }
        
    }
}

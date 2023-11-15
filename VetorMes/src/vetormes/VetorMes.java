package vetormes;

import java.util.Scanner;

/**
 * @since 15/11/2023
 * @author myckazs
 */
public class VetorMes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = teclado.nextInt();
        if (ano%4 != 0) {
            System.out.println("O ano de " + ano + " não é Bissexto");
            String m[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int t[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < m.length; i++) {
                System.out.println("O mês de " + m[i] + " tem " + t[i] + " dias.");
            }
        } else {
            System.out.println("O ano de " + ano + " é Bissexto");
            String m[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int t[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < m.length; i++) {
                System.out.println("O mês de " + m[i] + " tem " + t[i] + " dias.");
            }
        }

    }

}

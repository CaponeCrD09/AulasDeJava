package Atividades;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        // declarar variaveis inteiras e atribuir valores e imprimir a soma

        Scanner entrada = new Scanner(System.in);

        int x;
        int x1;
        System.out.print("Digite um valor :");
        x = entrada.nextInt();
        System.out.print("Digite outro valor :");
        x1 = entrada.nextInt();
        System.out.print("a soma dos numeso é " + (x + x1));

    }
}

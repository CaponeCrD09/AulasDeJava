package Atividade01;
import java.util.Scanner;

public class Atividade02 {
    
    public static void main(String[] args) {
        
        //declare uma variavel do tipo double  para temperatura em celsius , atribia o valor e imprima

        Scanner entrada = new Scanner(System.in);

        double x;

        System.out.println("Digite um valor flutuante para ser interpretado em celsius :");

        x = entrada.nextDouble();
        
        System.out.println("Digite um valor flutuante para ser interpretado em celsius :" + x);



    }
}

package Metrologia;
import java.util.Scanner;

public class Meteorologia {
    
    public static Scanner inputs = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("----------Calcula de Temperatura----------");
        Tempereatura();

        //double[][] teste = new double[3][1];
        // teste[0][0] = 1;
        // teste[2][0] = 5;
        // double teste2 = teste[2][0];
        // System.out.println(teste2);
    }

    public static void Tempereatura()
    {
        double[][] tabela = new double[5][2];
        String[] cidades = {"cidade A", "cidade B", "cidade C", "cidade D", "cidade E"};

        for(int i = 0; i < 5; i ++)
        {
            System.out.println(" ------ " + cidades[i] + " ------ ");
            System.out.println("Digite a temperatura em Celsius: ");
            tabela[i][0] = inputs.nextDouble();

            System.out.println("Digite a temperetura maxima:");
            tabela[i][1] = inputs.nextDouble();

        }

        for(int j = 0; j < 5; j ++)
        {
            //System.out.println("A temperatura em " + cidades[j] + " é de " + tabela[j][0] + "°C e a temperatura maxima é de " + tabela[j][1] + "°C");
            double min = tabela[j][0];
            double max = tabela[j][1];
            double media = (min + max) / 2;
            System.out.println("A temperatura em  °C na " + cidades[j] + " é de " + tabela[j][0] + "|" + tabela[j][1] + "|" + media + "°C");

        }
    }

    // public static String Alerta()
    // {
        
    // }


}

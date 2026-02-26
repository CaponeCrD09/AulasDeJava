package Filmes_pedro;
import java.util.Scanner;
import java.net.CacheRequest;
import java.util.ArrayList;

public class MaratonaFilmes {


    //public static double timeTotal;


    public static Scanner inputs = new Scanner(System.in);
    public static void main(String[] args) {

        Cabeca();
        System.out.println("Qual é a quantidade de filmes ?");
        int quantidade = inputs.nextInt();
        System.out.println("Qual é o tempo medio de cada filme?");
        double mediaTime = inputs.nextDouble();
        System.out.println("===========================");
        System.out.println("Seu tempo total é "+ ContaTime(quantidade, mediaTime, 0));
        double retorno = ContaTime(quantidade, mediaTime, mediaTime);
        System.out.println("");
        System.out.println(DefMaratona(retorno));
        System.out.println("===========================");
        System.out.println("");


    }
    public static void Cabeca()
    {
        System.out.println("==========================");
        System.out.println("");
        System.out.println("   Maratona de filmes");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");

    }
    public static String DefMaratona(double time)
    {
        if(time <= 4)
        {
            
            return "Maratona leva";
        }
        else if(time > 4 && time < 8)
        {
            return "Maratona moderada";
        }
        else if(time > 8)
        {
            return "Maratona pesada";
        }
        else
        {
            return " nada";
        }
    }

    public static double ContaTime(int quant,double mediaTime, double timeTotal)
    {
        timeTotal = quant * mediaTime;
        return timeTotal;
    }

    
    
}
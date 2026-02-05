import java.util.Scanner;
import java.util.ArrayList;

public class calculadora {

    public static Scanner inputs = new Scanner(System.in);

    public static int selection;

    
    public static void main(String[] args) {

        
        for(int i = 0; i < 10; i ++)
        {
                System.out.println("----------FeeHcalculeitor----------");

                System.out.println("Para Soma [1]");

                System.out.println("Para Subtrair [2]");

                System.out.println("Para Multiplicar [3]");

                System.out.println("Para Dividir [4]");

                System.out.println("Para fechar o programa [5]");


                selection = inputs.nextInt();

                if(selection == 1)
                {
                    System.out.println("----------Soma----------");
                    System.out.println("");
                    Soma();
                    i --;
                }
                if(selection == 2)
                {
                    System.out.println("----------Subtracao----------");
                    System.out.println("");
                    Subtracao();
                    i --;
                }
                if(selection == 3)
                {
                    System.out.println("----------Multiplicacao----------");
                    System.out.println("");
                    Multiplicacoa();
                    i --;
                }
                if(selection == 4)
                {
                    System.out.println("----------Divisao----------");
                    System.out.println("");
                    Divisao();
                    i --;
                }
                if(selection == 5)
                {
                    System.out.println("----------Ate a proxima ----------");
                    System.out.println("");
                    break;
                }
                
        }

    }
    public static void Soma()
    {
        System.out.println("Digite um numero: ");
        double x = inputs.nextDouble();
        System.out.println("Digite outro numero: ");
        double y = inputs.nextDouble();
        double z = x + y;
        System.out.println("Resultado :" + z);
    }
    public static void Subtracao()
    {
        System.out.println("Digite um numero: ");
        double x = inputs.nextDouble();
        System.out.println("Digite outro numero: ");
        double y = inputs.nextDouble();
        double z = x - y;
        System.out.println("Resultado :" + z);
    }
    public static void Multiplicacoa()
    {
        System.out.println("Digite um numero: ");
        double x = inputs.nextDouble();
        System.out.println("Digite outro numero: ");
        double y = inputs.nextDouble();
        double z = x * y;
        System.out.println("Resultado :" + z);
    }
    public static void Divisao()
    {
        System.out.println("Digite um numero: ");
        double x = inputs.nextDouble();
        System.out.println("Digite outro numero: ");
        double y = inputs.nextDouble();
        double z = x / y;
        System.out.println("Resultado :" + z);
    }

    
}

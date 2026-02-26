package Atividades;
import java.util.Scanner;
import java.util.ArrayList;

public class Revisao {

    
   static String[] nomes = new String[10];
   static ArrayList<String> nomesList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //System.out.println("para add um nome a lista digite 1 para ver a lista digite 2 ou 3 para sair fechar o programa!");
        
        //int selecao = entrada.nextInt();
        
        // cadasrtro de usuario com nome e idade


        /*String[] nome = new String[1000];

        System.out.println("Digite nomes para ser add a lista: ");
        
        nome[0] = entrada.next(); */

        for(int i = 0; i < 100; i ++){

            System.out.println("para add um nome a lista digite 1 para ver a lista digite 2 ou 3 para sair fechar o programa!");
            int selecao = entrada.nextInt();
            
            if(selecao == 1)
            {
                Cadastro();
            
            }
            else if(selecao == 2)
            {
                System.out.println(nomesList);
            }
            else if(selecao == 3)
            {
                System.out.println("Obrigado por usar o pograma !😊");
                break;
            }
        }
        
       /*switch (selecao) {
        case 1:
            Cadastro();
            break;
        case 2:
            System.out.print(nomesList);
            break;
        case 3:
            System.out.println("Obrigado por usar o pograma !😊");
       
        default:
            break;
       }
        */

           
    }

    public static void Cadastro()
    {
       Scanner entrada = new Scanner(System.in);

       //String[] nomes = new String[10];
       int contNome = 0;
       System.out.println("Digite o nome para add na lista:");
       

       if(nomesList.size() <= 10)
       {
            nomesList.add(contNome,entrada.next());
            contNome ++;
       }

    }
}

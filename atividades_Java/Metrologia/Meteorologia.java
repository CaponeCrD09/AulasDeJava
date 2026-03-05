package Metrologia;
import java.util.Scanner;


public class Meteorologia {
    
    public static Scanner inputs = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        cabeca();
        Tempereatura();

        //double[][] teste = new double[3][1];
        // teste[0][0] = 1;
        // teste[2][0] = 5;
        // double teste2 = teste[2][0];
        // System.out.println(teste2);
    }
    
    public static void Tempereatura()
    {
        
        String classificacao = "";
        double[][] tabela = new double[5][2];
        String[] cidades = {"A", "B", "C", "D", "E"};
        double maximo = 0;
        double medGeral = 10;

        for(int i = 0; i < 5; i ++)
        {
            System.out.println(" --------------- " + cidades[i] + " --------------- ");
            System.out.println("Digite a temperatura em Celsius "+i+" :");
            tabela[i][0] = inputs.nextDouble();
            
            System.out.println("Digite a temperetura maxima "+i+" :");
            tabela[i][1] = inputs.nextDouble();

        }
            System.out.println("cidade  |T.Max    |T.Min    |T.Méd    |Classificação");
            System.out.println("------------------------------------------------");
            cabeca();

            for(int j = 0; j < 5; j ++)
            {
                    //System.out.println("A temperatura em " + cidades[j] + " é de " + tabela[j][0] + "°C e a temperatura maxima é de " + tabela[j][1] + "°C");
                    double min = tabela[j][0];
                    double max = tabela[j][1];
                    double media = (min + max) / 2;
                    int media1 = (int) Math.round(media);

                    if(media1 < 17)
                    {
                        classificacao = " Frio";
                    }
                    else if(media1 > 30)
                    {
                        classificacao =" Quente";
                    }
                    else if(media1 > 17 && media1 < 30)
                    {
                        classificacao =" Agradavel";
                    }
                                
                                
                    System.out.println( cidades[j]+ "       |"+ tabela[j][0] + " C°  |" + tabela[j][1] + " C°  |" + media + "°C" +"   |"+ classificacao);
                                
                                
            }
        for(int q = 0 ; q < 5; q ++)
        {
            maximo = ((tabela[q][0] + tabela[q][1]) /2);
                
            medGeral = medGeral + maximo;
                            
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("ESTATISTICAS GERAIS");
        System.out.println(mediaGeral(medGeral));
            

    }

     public static void cabeca()
     {
        System.out.println("===================================================");
        System.out.println("  Sistema de análise meteorológica inteligente");
        System.out.println("===================================================");
        System.out.println("Análise detalhada por cidade:");
        System.out.println("");
     }

    public static String mediaGeral(double geral)
    {

        geral = geral / 10;
        String resposta = String.valueOf(geral);
        return"-Temperatura media geral : "+ resposta;
    }


}

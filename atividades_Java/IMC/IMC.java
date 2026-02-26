import java.util.Scanner;

public class IMC {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double imc = calcularIMC(0, 0);
        System.out.println("Seu IMC é: " + imc);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com o peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
    }
    public static double calcularIMC(double peso, double altura) {

        System.out.println("Digite seu peso em kg: ");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        return imc;
    }
}

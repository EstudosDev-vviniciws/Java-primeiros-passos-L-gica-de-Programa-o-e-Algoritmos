package Estrutura_Condicional;
import java.util.Scanner;

public class estruturaCondicional05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int minutos;
        double conta = 50;

        System.out.println("Digite a quantidade de minutos: ");
        minutos = scanner.nextInt();

        if(minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", conta);

        scanner.close();
    }
    
}

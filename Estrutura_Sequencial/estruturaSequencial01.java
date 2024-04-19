package Estrutura_Sequencial;
import java.util.Scanner;

public class estruturaSequencial01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.println("Digite a lagura: ");
        largura = scanner.nextDouble();
        System.out.println("Digite o comprimento: ");
        comprimento = scanner.nextDouble();
        System.out.println("Digite o metro quadrado: ");
        metroQuadrado = scanner.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;


        System.out.printf("A area é: %.2f%n", area);
        System.out.printf("O preço por metro quadrado é: %.2f%n", preco);

        scanner.close();

        
    }
    
}

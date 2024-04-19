package Estrutura_Sequencial;
import java.util.Scanner;

public class estruturaSequencial02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura, area, perimetro, diagnonal;

        System.out.println("Digite o valor da base: ");
        base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();
        
        area = base * altura;
        perimetro = 2.0 * (base + altura);
        diagnonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("Area: %.4f%n", area);
        System.out.printf("Perímetro: %.4f%n", perimetro);
        System.out.printf("Diagonal: %.4f%n", diagnonal);

        scanner.close();

    }
    
}

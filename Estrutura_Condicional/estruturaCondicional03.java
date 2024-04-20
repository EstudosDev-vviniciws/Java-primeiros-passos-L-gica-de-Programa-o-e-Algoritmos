package Estrutura_Condicional;
import java.util.Scanner;

public class estruturaCondicional03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, delta, r1, r2;

        System.out.println("Digite o valor de A: ");
        a = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = scanner.nextDouble();

        delta = b * b - 4.0 * a * c;

        if(a == 0 || delta < 0.0) {
            System.out.println("Impossível calcular. ");
        }
        else {
            r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1: %.5f%n", r1);
            System.out.printf("R2: %.5f%n", r2);
        }
        scanner.close();
    }
    
}

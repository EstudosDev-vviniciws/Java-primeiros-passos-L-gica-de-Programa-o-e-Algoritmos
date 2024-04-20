package Estrutura_Condicional;
import java.util.Scanner;

public class estruturaCondicional02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1,nota2,notaFinal;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda aula: ");
        nota2 = scanner.nextDouble();

        notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL: %.1f%n", notaFinal);

        if(notaFinal < 60) {
            System.out.println("Reprovado(a).");
        } 
        else {
            System.out.println("Aprovado(a)");
        }

        scanner.close();
    }

    
}

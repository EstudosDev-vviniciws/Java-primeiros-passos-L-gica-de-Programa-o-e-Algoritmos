package Estrutura_Sequencial;
import java.util.Scanner;
public class estruturaSequencial03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("Digite o primeiro nome: ");
        nome1 = scanner.next();
        System.out.println("Digite o segundo nome: ");
        nome2 = scanner.next();
        System.out.println("Digite a primeira idade: ");
        idade1 = scanner.nextInt();
        System.out.println("Digite a segunda idade: ");
        idade2 = scanner.nextInt();

        media = (double)(idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

        scanner.close();
    }

}
package Estrutura_Condicional;
import java.util.Scanner;

public class estruturaCondicional04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;
        
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = scanner.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("MENOR: " + n1);
        }
        else if (n2 < n3) {
            System.out.println("MENOR: " + n2);
        }
        else {
            System.out.println("MENOR: " + n3);
        }

        scanner.close();
    }
    
}

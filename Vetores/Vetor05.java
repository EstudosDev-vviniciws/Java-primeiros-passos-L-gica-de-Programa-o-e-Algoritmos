package Vetores;
import java.util.Scanner;

public class Vetor05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = scanner.next();
        }
        System.out.println("Nomes lidos: ");  
        for (String nome : nomes) {                            
            System.out.println(nome);
        }
        scanner.close();
    }
    
}

/*  Na linha 14 ao inves de usar "for (int i = 0; i < N; i++)"  
    foi usado "for (String nome : nomes)" , pois assim é lido 
    cada String nome no vetor de "nomes".)*/

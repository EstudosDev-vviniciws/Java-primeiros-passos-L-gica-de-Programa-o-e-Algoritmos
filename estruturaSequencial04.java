import java.util.Scanner;

public class estruturaSequencial04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, resto, horas, minutos, segundos;

        N = scanner.nextInt();

        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


        scanner.close();
    }
    
}

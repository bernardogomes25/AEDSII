package TreinoBasico;
import java.util.Scanner;

public class CompararNum {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva um número: \n");
        int a = scanner.nextInt();
        System.out.println("Escreva outro número: \n");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else {
            System.out.println("O maior número é: " + b);
        }
    }
}
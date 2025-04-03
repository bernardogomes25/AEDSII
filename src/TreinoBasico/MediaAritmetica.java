package TreinoBasico;
import java.util.Scanner;

public class MediaAritmetica {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double soma = 0;
        double media;
        System.out.println("Quantos números voce deseja somar à média?\n");
        int n = scanner.nextInt();
        System.out.println("\nDigite os valores: \n");
        for (int i=n; i>0; i--){
            int a = scanner.nextInt();
            soma += a;
        }
        media = (soma/n);
        System.out.println("\nA média dos números é: " + media);
    }
}
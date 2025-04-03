package TreinoBasico;
import java.util.Scanner;

public class MaiorNumArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int vet[] = {0,0,0,0,0};
        int i;
        int max=0;
        for (i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            vet[i] = scanner.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if(vet[i]>max){
                max=vet[i];
            }
        }
        System.out.println("\nO maior número é: " + max);
    }
}
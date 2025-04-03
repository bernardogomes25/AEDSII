package TreinoBasico;
import java.util.Scanner;

public class MaiorNum {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int maior=0;
        for(int i=0; i<5; i++){
            System.out.println("Digite um número");
            int num = scanner.nextInt();
            if(num>maior){
                maior=num;
            }
        }
        System.out.println("\nO maior número é: " + maior);
    }
}
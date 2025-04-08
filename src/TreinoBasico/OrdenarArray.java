package TreinoBasico;
import java.util.Random;

public class OrdenarArray {
    public static void main(String[] args) {
        Random gerador = new Random();
        int i, j;
        int vet[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        //Gerar números aleatorios
        for (i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(99);
        }
        System.out.println("\nNúmeros do array na ordem atual:\n");
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        //BubbleSort
        for (i = 0; i < vet.length - 1; i++) {
            for (j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nNúmeros do array ordenados:\n");
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
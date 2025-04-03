package TreinoBasico;
import java.util.Scanner;

public class CompararStr {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String txt = ".";
        while(! txt.equals("fim")){
            System.out.println("\nDigite um texto (fim para finalizar o programa): \n");
            txt = scanner.nextLine();
            System.out.println("\n" + txt);
            if(txt.equals("fim")){
                System.out.println("\nEncerrando programa...");
            }
        }
    }
}
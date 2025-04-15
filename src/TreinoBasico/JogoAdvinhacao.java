package TreinoBasico;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite uma palavra para a forca(use hífen para espaço):\n");
        String forca=scanner.nextLine();

        int tamanho=forca.length();
        StringBuilder asterisco = new StringBuilder(String.valueOf('*').repeat(tamanho));
        System.out.println(String.valueOf('\n').repeat(60) + asterisco);

        int tentativas=0;
        int erros=0;
        String letrasErradas="";

        while(!forca.equals(asterisco.toString())){
            System.out.println("Chute uma letra:\n");
            char chute=scanner.next().charAt(0);
            tentativas++;

            boolean acertou=false;

            for(int i=0; i<forca.length();i++){
                if (chute==forca.charAt(i)){
                    asterisco.setCharAt(i, chute);
                    acertou=true;
                }
            }

            if(!acertou){
                if(!letrasErradas.contains(String.valueOf(chute))){
                    letrasErradas +=chute + " ";
                }
                erros++;
            }

            System.out.println("Palavra: " + asterisco);
            System.out.println("Letras erradas: " + letrasErradas);
        }
        System.out.println("\nGanhou o jogo! A palavra era: " + forca);
        System.out.println("Você conseguiu em " + tentativas + " tentativas.");
        System.out.println("Você errou " + erros + " vez(es).");
    }
    
}
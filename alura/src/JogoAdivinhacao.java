import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        Scanner leitor = new Scanner(System.in);

        while (tentativas <5){
            System.out.println("Digite um número entre 0 e 100");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Você acertou o número em " + tentativas + " tentativas. Parabéns!!!");
                break;
            } else if(numeroDigitado > numeroGerado){
                System.out.println("O número digitado é maior que o número gerado" );
            }else {
                System.out.println("O número digitado é menor que o número gerado" );
            }
            if (tentativas == 5){
                System.out.println("Você não acertou! Suas 5 tentativas acabaram.O número gerado era " + numeroGerado);
        }

        }
    }
}

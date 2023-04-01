import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo_487 {
    public static void inverte(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - i - 1];
            vetor[tamanho - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê os números a serem adicionados no vetor
        System.out.println("Digite os números para o vetor:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
        }

        // Inverte o vetor
        inverte(vetor, 10);

        // Imprime o vetor invertido
        System.out.println("O vetor invertido é: " + Arrays.toString(vetor));
        input.close();
    }
}

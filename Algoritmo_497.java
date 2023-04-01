import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo_497 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posicao " + i + ": ");
            vetor[i] = input.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        System.out.print("Informe o valor a ser buscado: ");
        int valorBuscado = input.nextInt();

        input.close();

        int posicao = Arrays.binarySearch(vetor, valorBuscado);

        if (posicao >= 0) {
            System.out.println("O valor " + valorBuscado + " foi encontrado na posicao " + posicao + " do vetor.");
        } else {
            System.out.println("O valor " + valorBuscado + " nao foi encontrado no vetor.");
        }
    }
}

import java.util.Scanner;

public class Algoritmo_485 {
    public static void imprimirCaracteres(int[] vetor1, char[] vetor2, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            int n = vetor1[i];
            char c = vetor2[i];
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê os números a serem adicionados no vetor de inteiros
        System.out.println("Digite os números para o vetor de inteiros:");
        int[] vetor1 = new int[6];
        for (int i = 0; i < 6; i++) {
            vetor1[i] = input.nextInt();
        }

        // Lê os caracteres a serem adicionados no vetor de caracteres
        System.out.println("Digite os caracteres para o vetor de caracteres:");
        char[] vetor2 = new char[6];
        for (int i = 0; i < 6; i++) {
            vetor2[i] = input.next().charAt(0);
        }

        // Chama a função para imprimir os caracteres
        imprimirCaracteres(vetor1, vetor2, 6);

        input.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Algoritmo_499 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int[] vetor = null;

        while (opcao != 4) {
            System.out.println("\n------MENU------");
            System.out.println("1 - Passar dados do vetor");
            System.out.println("2 - Ordenar vetor");
            System.out.println("3 - Imprimir vetor");
            System.out.println("4 - Encerrar programa");
            System.out.print("Digite a opcao desejada: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tamanho do vetor: ");
                    int tamanho = input.nextInt();
                    vetor = new int[tamanho];
                    for (int i = 0; i < tamanho; i++) {
                        System.out.print("Digite o valor para o indice " + (i+1) + ": ");
                        vetor[i] = input.nextInt();
                    }
                    break;

                case 2:
                    if (vetor != null) {
                        Arrays.sort(vetor);
                        System.out.println("Vetor ordenado com sucesso!");
                    } else {
                        System.out.println("Nenhum vetor foi passado ainda.");
                    }
                    break;

                case 3:
                    if (vetor != null) {
                        System.out.println("Vetor atual: " + Arrays.toString(vetor));
                    } else {
                        System.out.println("Nenhum vetor foi passado ainda.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

        input.close();
    }
}

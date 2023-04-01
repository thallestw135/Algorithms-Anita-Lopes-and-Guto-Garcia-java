import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo_495 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        input.nextLine();


        String[] vetor = new String[tamanho];
        System.out.print("Digite as palavras do vetor: ");
        for(int i = 0; i < tamanho; i++){
            vetor[i] = input.nextLine();
        }

        ordernar(vetor);

        System.out.println("O vetor ordenado: " + Arrays.toString(vetor));
        input.close();
    }

    static void ordernar(String[] vetor){
        Arrays.sort(vetor);
    }
}

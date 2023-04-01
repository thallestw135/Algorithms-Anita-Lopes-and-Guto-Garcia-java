import java.util.Scanner;

public class Algoritmo_493 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        
        int[] vetor = new int[tamanho];
        System.out.print("Digite os valores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
        }
        
        String resultado = verificaOrdenacao(vetor, tamanho);
        System.out.println("O vetor esta em ordem " + resultado + ".");
        
        input.close();
    }
    
    public static String verificaOrdenacao(int[] vetor, int tamanho) {
        boolean crescente = true;
        boolean decrescente = true;
        
        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] > vetor[i+1]) {
                crescente = false;
            } else if (vetor[i] < vetor[i+1]) {
                decrescente = false;
            }
        }
        
        if (crescente) {
            return "crescente";
        } else if (decrescente) {
            return "decrescente";
        } else {
            return "desordenada";
        }
    }
}

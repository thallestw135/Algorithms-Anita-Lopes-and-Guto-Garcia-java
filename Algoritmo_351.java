import java.util.Scanner;

public class Algoritmo_351 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        
        // Ler os nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = input.nextLine();
        }
        
        // Imprimir o nome selecionado
        System.out.print("Digite o número da pessoa que deseja imprimir o nome (1 a 5): ");
        int numPessoa = input.nextInt();
        input.nextLine(); // Limpar o buffer do teclado
        String nomeSelecionado = nomes[numPessoa-1];
        System.out.println("Nome da pessoa " + numPessoa + ": " + nomeSelecionado);
        
        input.close();
    }
    
}

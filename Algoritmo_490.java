import java.util.Scanner;

public class Algoritmo_490 {
    public static int substituiCaractere(String[] vetor, int tamanho, char caractere) {
        int qtdRetirada = 0;  // variável para armazenar o total de caracteres retirados
        
        // percorre o vetor de palavras
        for (int i = 0; i < tamanho; i++) {
            String palavra = vetor[i];
            int qtdPalavraRetirada = 0;  // variável para armazenar o total de caracteres retirados na palavra
            
            // converte a palavra para um array de caracteres para facilitar a substituição
            char[] caracteres = palavra.toCharArray();
            
            // percorre o array de caracteres, substituindo o caractere e contabilizando as substituições
            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == caractere) {
                    caracteres[j] = '*';
                    qtdRetirada++;
                    qtdPalavraRetirada++;
                }
            }
            
            // converte o array de caracteres de volta para a palavra
            vetor[i] = new String(caracteres);
            
            System.out.println("Palavra " + (i + 1) + ": " + vetor[i] + " (" + qtdPalavraRetirada + " caracteres retirados)");
        }
        
        return qtdRetirada;
    }
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor de palavras: ");
        int tamanho = input.nextInt();
        input.nextLine();  // consumir o \n deixado pelo nextInt
        
        String[] vetor = new String[tamanho];
        
        // preencher o vetor de palavras com input do usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            vetor[i] = input.nextLine();
        }
        
        System.out.print("Digite o caractere a ser retirado: ");
        char caractere = input.nextLine().charAt(0);
        
        int qtdRetirada = substituiCaractere(vetor, tamanho, caractere);
        System.out.println("Total de caracteres retirados: " + qtdRetirada);
    
        input.close();
    }
    
}

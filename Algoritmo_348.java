import java.util.Scanner;

public class Algoritmo_348 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        double[][] notas = new double[5][2];
        
        // Ler os dados dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i+1));
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Nota 1: ");
            notas[i][0] = input.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = input.nextDouble();
            input.nextLine(); // Limpar o buffer do teclado
        }
        
        // Imprimir a listagem
        System.out.println("\nLISTAGEM DE ALUNOS");
        for (int i = 0; i < 5; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.println("Aluno " + (i+1) + ": " + nomes[i] + " - Nota 1: " + notas[i][0] + " - Nota 2: " + notas[i][1] + " - Média: " + media);
        }
        
        input.close();
    }
    
}

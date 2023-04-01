import java.util.Scanner;

public class Algoritmo_356 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[15];
        double[] notasPR1 = new double[15];
        double[] notasPR2 = new double[15];
        double[] medias = new double[15];
        String[] situacoes = new String[15];
        
        // Ler os nomes e notas das PR1 e PR2
        for (int i = 0; i < 15; i++) {
            System.out.println("Aluno " + (i+1) + ":");
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Nota PR1: ");
            notasPR1[i] = input.nextDouble();
            System.out.print("Nota PR2: ");
            notasPR2[i] = input.nextDouble();
            input.nextLine(); // Limpar o buffer do teclado
            double media = (notasPR1[i] + notasPR2[i]) / 2.0;
            medias[i] = Math.round(media); // Arredonda a média
            situacoes[i] = (medias[i] >= 6.0) ? "AP" : "RP"; // Verifica a situação
        }
        
        // Imprimir a listagem de alunos
        System.out.println("NOME\t\tNOTA PR1\tNOTA PR2\tMÉDIA\tSITUAÇÃO");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%-15s\t%.1f\t\t%.1f\t\t%.0f\t%s\n", nomes[i], notasPR1[i], notasPR2[i], medias[i], situacoes[i]);
        }
        
        input.close();
    }
    
}

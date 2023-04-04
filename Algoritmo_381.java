import java.util.Scanner;

public class Algoritmo_381 {
    Scanner input = new Scanner(System.in);

    public void Ordenar() {
        System.out.println("Digite os nomes:");
        String[] vetor = new String[10];
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = input.nextLine();
        }

        int count = 1;
        for(String nome: vetor){
            System.out.println(count + ". " + nome);
            count++;
        }
        
    
    }
    public static void main(String[] args) {
        Algoritmo_381 ordem = new Algoritmo_381();

        ordem.Ordenar();
    }
}

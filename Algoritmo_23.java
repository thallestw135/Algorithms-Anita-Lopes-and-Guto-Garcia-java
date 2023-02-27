import java.util.Scanner;

public class Algoritmo_23 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de três casas: ");
        int x = input.nextInt();

        int y = x % 100 / 10 ;
        System.out.println("Algarismo da casa das dezenas: " + y);

        input.close();

    }
    

}

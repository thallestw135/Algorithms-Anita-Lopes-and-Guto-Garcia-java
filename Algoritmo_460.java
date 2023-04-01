import java.util.Scanner;

public class Algoritmo_460 {
    Scanner input = new Scanner(System.in);

    public void Dobro(){
        for(int i = 0; i<3; i++){
            System.out.print("digite um número: ");
            double first_number = input.nextDouble();
            System.out.println("dobro: " + first_number * 2);
            System.out.println("-----------------------------");
        }
        input.close();
    }

    public static void main(String[] args) {
        Algoritmo_460 conta = new Algoritmo_460();
        conta.Dobro();
    }
}

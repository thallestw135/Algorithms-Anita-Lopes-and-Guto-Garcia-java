import java.util.Scanner;

public class Algoritmo_465 {
    Scanner input = new Scanner(System.in);


    public void Maior(){
        System.out.print("digite o primeiro numero: ");
        double first = input.nextDouble();
        System.out.print("digite o primeiro numero: ");
        double second = input.nextDouble();
        System.out.print("O maior numero: "+Math.max(first, second));
    }

    public static void main(String[] args) {
        Algoritmo_465 conta = new Algoritmo_465();

        conta.Maior();
    }
}

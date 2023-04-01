import java.util.Scanner;

public class Algoritmo_470 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();
        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo.");
        }
        input.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class Algoritmo_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Calcular o logaritmo na base 10
        double logaritmo = Math.log10(numero);

        // Imprimir o resultado
        System.out.println("O logaritmo de " + numero + " na base 10 é: " + logaritmo);
        scanner.close();
    }
}

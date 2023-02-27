import java.util.Scanner;

public class Algoritmo_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        System.out.print("Digite a base do logaritmo: ");
        double base = scanner.nextDouble();

        // Calcular o logaritmo na base desejada
        double logaritmo = Math.log(numero) / Math.log(base);

        // Imprimir o resultado
        System.out.println("O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
        scanner.close();
    }
}

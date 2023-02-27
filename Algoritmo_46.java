import java.util.Scanner;

public class Algoritmo_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        double novo_saldo = saldo * 1.01;

        System.out.println("Novo saldo: " + novo_saldo);

        scanner.close();
    }
} 
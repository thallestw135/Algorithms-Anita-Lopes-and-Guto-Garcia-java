import java.util.Scanner;

public class Algoritmo_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts gasta pela residência: ");
        double consumo = scanner.nextDouble();

        // Calcular o valor de cada quilowatt
        double valorQuilowatt = salarioMinimo / (100 * 7);

        // Calcular o valor da conta de energia
        double valorConta = consumo * valorQuilowatt;

        // Calcular o valor da conta com desconto de 10%
        double valorContaComDesconto = valorConta * 0.9;

        // Imprimir os resultados
        System.out.printf("O valor de cada quilowatt é R$%.2f\n", valorQuilowatt);
        System.out.printf("O valor da conta de energia é R$%.2f\n", valorConta);
        System.out.printf("O valor da conta com desconto de 10%% é R$%.2f\n", valorContaComDesconto);
        scanner.close();
    }
}

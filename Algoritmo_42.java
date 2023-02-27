import java.util.Scanner;

public class Algoritmo_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double angulo = scanner.nextDouble();

        // Converter o ângulo para radianos
        double anguloRadiano = Math.toRadians(angulo);

        // Calcular o seno, cosseno e tangente
        double seno = Math.sin(anguloRadiano);
        double coseno = Math.cos(anguloRadiano);
        double tangente = Math.tan(anguloRadiano);

        // Calcular a secante, co-secante e co-tangente
        double secante = 1.0 / coseno;
        double cossecante = 1.0 / seno;
        double cotangente = 1.0 / tangente;

        // Imprimir os resultados
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + coseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Co-secante: " + cossecante);
        System.out.println("Co-tangente: " + cotangente);

        scanner.close();
    }
}


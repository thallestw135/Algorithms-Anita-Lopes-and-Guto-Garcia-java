import java.util.*;

public class Algoritmo_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        int dado1 = input.nextInt();
        System.out.print("Entre com o segundo número: ");
        int dado2 = input.nextInt();
        System.out.print("Entre com o terceiro número: ");
        int dado3 = input.nextInt();
        System.out.print("Entre com o quarto número: ");
        int dado4 = input.nextInt();

        int media_ponderada = (dado1*1 + dado2*2 + dado3*3 + dado4*4)/10;
        System.out.print("Média ponderada é: " + media_ponderada);

        input.close();
    }
}

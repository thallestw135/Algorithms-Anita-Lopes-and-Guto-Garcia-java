import java.util.Scanner;

public class Algoritmo_471 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        int count = contarDivisoes(num1, num2);
        System.out.println(num1 + " e divisivel por " + num2 + " --> " + count + " vezes.");
        input.close();
    }

    public static int contarDivisoes(int num1, int num2) {
        int count = 0;
        while (num1 % num2 == 0) {
            count++;
            num1 /= num2;
        }
        return count;
    }
}

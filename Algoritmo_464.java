import java.util.Scanner;

public class Algoritmo_464 {
    Scanner input = new Scanner(System.in);

    public void Conversao(){
        System.out.print("Digite o angulo em radianos a ser convertido: ");
        double radi = input.nextDouble();
        System.out.println("Aproximadamente: " + radi / 57.29);
    
    }
    public static void main(String[] args) {
        Algoritmo_464 conta = new Algoritmo_464();

        conta.Conversao();
    }
}

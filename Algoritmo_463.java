import java.util.Scanner;

public class Algoritmo_463 {
    Scanner input = new Scanner(System.in);

    public void Conversao(){
        System.out.print("Digite o angulo em graus a ser convertido: ");
        double graus = input.nextDouble();
        System.out.println("Aproximadamente: " + graus * 57.29);
    
    }
    public static void main(String[] args) {
        Algoritmo_463 conta = new Algoritmo_463();

        conta.Conversao();
    }
}

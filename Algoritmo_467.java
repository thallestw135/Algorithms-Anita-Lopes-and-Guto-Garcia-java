import java.util.Scanner;

public class Algoritmo_467 {
    Scanner input = new Scanner(System.in);

    public void Log(){
        for(int i = 0; i<3; i++){
            System.out.print("digite o logaritmando: ");
            double first = input.nextDouble();
            System.out.print("digite a base: ");
            double second = input.nextDouble();

            double result = Math.log(first) / Math.log(second);
            System.out.println("Logaritmo: " + result);
            System.out.println("----------------------------");
        }
    
    }

    public static void main(String[] args) {
        Algoritmo_467 conta = new Algoritmo_467();

        conta.Log();
    }
}

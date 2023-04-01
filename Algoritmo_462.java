import java.util.Scanner;

public class Algoritmo_462 {
    Scanner input = new Scanner(System.in);

    public void Media(){
        System.out.print("digite a nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("digite a nota 2: ");
        double nota2 = input.nextDouble();
        System.out.print("digite a nota 3: ");
        double nota3 = input.nextDouble();
        
        System.out.println("Média aritmetica: "+(nota1+nota2+nota3) / 3);
    }

    public static void main(String[] args) {
        Algoritmo_462 conta = new Algoritmo_462();

        conta.Media();
    }
}

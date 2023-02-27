import java.util.*;

public class Algoritmo_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data no formato DDMMAA: ");
        int data = input.nextInt();
        
        int dia = data /10000;
        int mes = data % 10000 / 100;
        int ano = data % 100;
        System.out.println("dia: " + dia);
        System.out.println("mês: " + mes);
        System.out.println("ano: " + ano);

        input.close();
    }
   
}

import java.util.*;

public class Algoritmo_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data no formato DDMMAA: ");
        int data = input.nextInt();
        StringBuilder builder = new StringBuilder();
        
        int dia = data / 10000;
        int mes = data % 10000 / 100;
        int ano = data % 100;
        builder.append(data);
        builder.reverse();
        int invertido = Integer.parseInt(builder.toString());

        System.out.println("dia: " + dia);
        System.out.println("mês: " + mes);
        System.out.println("ano: " + ano);
        System.out.println("Data no formato MMDDAA: " + invertido);


        input.close();
    }
   
}
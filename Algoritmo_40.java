import java.util.*;

public class Algoritmo_40 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Entre com o divisor: ");
        int divisor = input.nextInt();

        System.out.println("Dividendo: "+dividendo);
        System.out.println("Divisor: "+divisor);

        int quoc = dividendo / divisor;
        int rest = dividendo % divisor;

        System.out.println("Quociente: " + quoc);
        System.out.println("Resto: " + rest);

        input.close();
    }
}

import java.util.Scanner;

public class Algoritmo_473 {
    Scanner input = new Scanner(System.in);

    public boolean Char(String letra){
        if(letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
            System.out.println("0");
            return false;
        }else{
            System.out.println("1");
            return true;
        }
    }

    public static void main(String[] args) {
        Algoritmo_473 conta = new Algoritmo_473();

        conta.Char("a");
    }
}

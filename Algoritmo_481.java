import java.util.Scanner;

public class Algoritmo_481{

    public void Converte(){
        Scanner input = new Scanner(System.in);
        int decimal, base, resto;

        do{
            System.out.print("Digite um número maior ou igual a 0: ");
            decimal = input.nextInt();
            System.out.print("Digite a base em que deseja representa-lo(2-10): ");
            base = input.nextInt();

            String convertido = "";

            while (decimal > 0) {
                resto = decimal % base;
                convertido = resto + convertido;
                decimal /= base;
            }
            
            System.out.println("O numero " + decimal + " em base: " + base + ": " + convertido);

        }while(decimal < 0);
       
       input.close();
        

        
    
    
    
    }   
    public static void main(String[] args) {
        Algoritmo_481 conta = new Algoritmo_481();

        conta.Converte();
    }
}
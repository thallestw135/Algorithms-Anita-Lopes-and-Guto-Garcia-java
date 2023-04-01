import java.util.Scanner;

public class Algoritmo_480 {
    Scanner input = new Scanner(System.in);

    public void Reverso(){
        try{
            System.out.print("Digite um numero: ");
            int original = input.nextInt();
            String stringOriginal = Integer.toString(original);
            String stringInvertida = new StringBuilder(stringOriginal).reverse().toString();
            int invertido = Integer.parseInt(stringInvertida);
        
            
            
            if(original == invertido){
                System.out.println(original + " - " + invertido);
                System.out.println("E um numero capicua.");
            }else{
                System.out.println(original + " - " + invertido);
                System.out.println("Nao e numero capicua.");
            }
        }catch(Exception e){
            System.out.println("Digite um numero inteiro!!!");
        }
        

      
        
    }

    public static void main(String[] args) {
        Algoritmo_480 conta = new Algoritmo_480();

        conta.Reverso();
    }
}

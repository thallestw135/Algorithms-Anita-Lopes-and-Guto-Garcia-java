import java.util.Scanner;

public class Algoritmo_358 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numMercadorias = 100;
        double precoCompra, precoVenda;
        int contLucro = 0, contPrejuizo = 0;
        
        // Ler o preço de compra e o preço de venda de cada mercadoria
        for (int i = 1; i <= numMercadorias; i++) {
            System.out.println("Mercadoria " + i + ":");
            System.out.print("Preço de compra: ");
            precoCompra = input.nextDouble();
            System.out.print("Preço de venda: ");
            precoVenda = input.nextDouble();
            if (precoVenda > precoCompra) {
                contLucro++;
            } else if (precoVenda < precoCompra) {
                contPrejuizo++;
            }
        }
        
        // Imprimir o resultado
        System.out.println("Total de mercadorias:");
        System.out.println("- Com lucro: " + contLucro);
        System.out.println("- Com prejuízo: " + contPrejuizo);
        
        input.close();
    }
    
}

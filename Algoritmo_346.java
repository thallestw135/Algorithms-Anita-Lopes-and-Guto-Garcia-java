import java.util.Scanner;

public class Algoritmo_346 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String frase = "";
        int opcao = 0;
        
        while (opcao != 4) {
            // Imprimir o menu
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            
            // Ler a opção do usuário
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite uma frase: ");
                    input.nextLine(); // Limpar o buffer do teclado
                    frase = input.nextLine();
                    System.out.println("O comprimento da frase é: " + frase.length());
                    break;
                case 2:
                    System.out.print("Digite uma frase: ");
                    input.nextLine(); // Limpar o buffer do teclado
                    frase = input.nextLine();
                    System.out.println("Os dois primeiros caracteres são: " + frase.substring(0, 2));
                    System.out.println("Os dois últimos caracteres são: " + frase.substring(frase.length() - 2));
                    break;
                case 3:
                    System.out.print("Digite uma frase: ");
                    input.nextLine(); // Limpar o buffer do teclado
                    frase = input.nextLine();
                    String fraseEspelhada = "";
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        fraseEspelhada += frase.charAt(i);
                    }
                    System.out.println("A frase espelhada é: " + fraseEspelhada);
                    break;
                case 4:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            System.out.println(); // Pular uma linha entre as iterações
        }
        
        input.close();
    }
    
}

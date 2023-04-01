public class Algoritmo_483 {
 
    
    public int Vetors(int[] vetor1, int[] vetor2, int quantidade){
        int produtointerno = 0;

        for(int i = 0; i < quantidade; i++){
            produtointerno +=vetor1[i] * vetor2[i];
        }

        return produtointerno;
        
    }
    public static void main(String[] args) {
        Algoritmo_483 conta = new Algoritmo_483();
        
        int[] vetor1 = {2,3,4,5};
        int[] vetor2 = {1,2,3,4};
        int quantidade = 4;
        

        int produto = conta.Vetors(vetor1, vetor2, quantidade);
        System.out.print("Produto interno: "+produto);



    }
}

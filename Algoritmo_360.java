import java.util.Scanner;

public class Algoritmo_360 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int data;
        
        do {
            System.out.print("Digite a data de nascimento (ddmm) ou 9999 para sair: ");
            data = input.nextInt();
            if (data != 9999) {
                String horoscopo = obterHoroscopo(data);
                System.out.println("Horóscopo: " + horoscopo);
            }
        } while (data != 9999);
        
        input.close();
    }
    
    public static String obterHoroscopo(int data) {
        int dia = data / 100;
        int mes = data % 100;
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }
    
}

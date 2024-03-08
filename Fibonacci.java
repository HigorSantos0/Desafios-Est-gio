package testeGUPY;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        boolean estaNaSequencia = verificaSeEstaNaSequencia(numero);
        
    
        if (estaNaSequencia) {
            System.out.println(numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não está na sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
    public static boolean verificaSeEstaNaSequencia(int numero) {
        int primeiro = 0;
        int segundo = 1;
        
        while (primeiro <= numero) {
            if (primeiro == numero) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        
        return false;
    }
}

package testeGUPY;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();
        
        String invertedString = inverteString(input);
        
        System.out.println("String invertida: " + invertedString);
        
        scanner.close();
    }
    
    public static String inverteString(String input) {
        char[] caracteres = input.toCharArray();
        int tamanho = caracteres.length;
        char[] invertedCaracteres = new char[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            invertedCaracteres[i] = caracteres[tamanho - 1 - i];
        }
        
        return new String(invertedCaracteres);
    }
}

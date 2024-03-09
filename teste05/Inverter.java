package teste05;

import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a sua palavra: ");
        String palavra = scanner.nextLine();

        char[] caracteres = palavra.toCharArray();

        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        String invertida = new String(caracteres);


        System.out.println(invertida);

        scanner.close();
    }
}
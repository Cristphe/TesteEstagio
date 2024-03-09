package teste02;

import java.util.ArrayList;
import java.util.Scanner;

public class TabelaFibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();

        int in = 1;
        int ne = 0;
        int aux;

        for (int i = 0; i < 30; i++) {
            fibonacci.add(in);
            aux = in;
            in = in + ne;
            ne = aux;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um número e verifique se está na tabela: ");
        int numero = scanner.nextInt();

        boolean estaNaSequencia = false;
        for (int num : fibonacci) {
            if (num == numero) {
                estaNaSequencia = true;
                break;
            }
        }

        if (estaNaSequencia) {
            System.out.println(numero + " Está presente na tabela");
        } else {
            System.out.println("Escolha outro número na próxima");
        }

        scanner.close();
    }
}
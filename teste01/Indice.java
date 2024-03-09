package teste01;

import java.util.Scanner;

public class Indice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja a função While ou For? ");
        String escolha = scanner.nextLine();

        switch (escolha){
            case "While":
                While();
                break;
            case "For":
                For();
                break;
            default:
                System.out.println("Você escolheu uma opção inválida, ou digitou incorretamente, tente novamente!");
        }

    }

    public static void While(){
        int indice=13;
        int soma=0;
        int k=0;
        while(k < indice){
            soma = soma + k;
            k ++;
        }
        System.out.println(soma);
    }

    public static void For(){
        int indice=13;
        int soma=0;
        for (int k=0; k < indice; k++){
            soma = soma + k;
        }
        System.out.println(soma);
    }
}

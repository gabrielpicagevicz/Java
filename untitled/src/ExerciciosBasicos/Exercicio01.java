package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroValor, segundoValor;
        double soma;

        System.out.println("Digite o primeiro valor");
        primeiroValor = sc.nextInt();

        System.out.println("Digite o segundo valor");
        segundoValor = sc.nextInt();

        soma = (primeiroValor + segundoValor);

        System.out.println("A soma entre eles é: "+soma);


    }
}

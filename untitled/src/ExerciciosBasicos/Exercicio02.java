package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, raio, pi = 3.14159;

        System.out.println("Qual o raio do circulo");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("Área=%.4f%n",pi);
    }
}

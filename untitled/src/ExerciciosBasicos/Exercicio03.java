package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        double diferenca;

        System.out.println("Digite o primeiro valor");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        c = sc.nextInt();
        System.out.println("Digite o quarto valor");
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("A diferença entre eles é: "+diferenca);

    }
}

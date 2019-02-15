package exercicio02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String args []){

        System.out.println("insira o valor do raio da lata:");
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();

        System.out.println("Insira o valor da altura da lata:");
        Scanner t = new Scanner(System.in);
        double altura = t.nextDouble();

        double volume = 3.141559 * (raio*raio) * altura;
        System.out.println("Volume: " + volume);
    }
}

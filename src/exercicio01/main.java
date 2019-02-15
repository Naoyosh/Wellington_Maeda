package exercicio01;

import java.util.Scanner;

public class main {

    public static void main (String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um valor");

        double conta = s.nextDouble();
        double resultado = conta * 1.1;

        System.out.println("Insira o valor: " + conta);
        System.out.println("Resultado: " + resultado);
    }
}

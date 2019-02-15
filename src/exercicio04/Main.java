package exercicio04;

import java.util.Scanner;

public class Main {

    public static void main (String args []){

        System.out.println("Digite um número:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (0<=num && num<=100){
            System.out.println("Número compreendido!");
        }else{
            System.out.println("Número não compreendido!");
        }

    }

}

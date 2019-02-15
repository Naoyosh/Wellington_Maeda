package exercicio03;

import java.util.Scanner;

public class Main {

    public static void main (String args []){

        System.out.println("insira o valor do salário:");
        Scanner s = new Scanner(System.in);
        double salario = s.nextDouble();

        System.out.println("Insira o valor da prestação:");
        Scanner p = new Scanner(System.in);
        double prestacao = p.nextDouble();

        double valorEmp = salario * 0.3;

        if (valorEmp >= prestacao){
            System.out.println("Emprestimo concedido =)");
        }else{
            System.out.println("Emprestimo não concedido! =(");
        }


    }
}

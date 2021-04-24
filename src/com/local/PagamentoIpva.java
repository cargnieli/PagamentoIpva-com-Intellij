package com.local;

import java.util.Scanner;


public class PagamentoIpva {

    public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

	    System.out.print("Entre com o final da placa: ");
	    int finalPlaca = entrada.nextInt();

	    switch (finalPlaca) {
            case 1:
                System.out.println("Vencimento dia 11 de janeiro");
                break;
            case 2:
                System.out.println("Vencimento dia 12 de janeiro");
                break;
            case 3:
                System.out.println("Vencimento dia 13 de janeiro");
                break;
            default:
                System.out.println("Entrada inválida, tente novamente!");

        }

    }
}

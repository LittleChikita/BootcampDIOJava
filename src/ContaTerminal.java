/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANGEL
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero ;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();
        System.out.println("Por favor, digite a Agência !");
        agencia = sc.next();
        sc.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o Saldo");
        saldo = sc.nextDouble();
        System.out.println("\"Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo" +  saldo + "já está disponível para saque\".");
    }
}

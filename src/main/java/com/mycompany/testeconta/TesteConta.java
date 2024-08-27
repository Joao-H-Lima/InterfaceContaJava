/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testeconta;

/**
 *
 * @author 55199
 */
public class TesteConta {
        
    public static void main(String[] args) {
        InterfaceTransacoes newSaque = new Saque();
        InterfaceTransacoes newDep  =new Deposito();
        InterfaceTransacoes transacoes = new Extrato();
        
        ContaBanc conta1 = new ContaBanc();
        
        conta1.setNumeroConta(111);
        conta1.setSaldo(1000);
        System.out.println("Saldo inicial: "+conta1.getSaldo());
        
        newSaque.saque(conta1,50);
        newDep.deposito(conta1, 500);
        
        transacoes.extrato(conta1);

        
    }


}

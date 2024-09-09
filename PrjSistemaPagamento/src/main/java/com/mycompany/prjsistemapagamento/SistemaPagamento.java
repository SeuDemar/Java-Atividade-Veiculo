/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prjsistemapagamento;

/**
 *
 * @author Vitor
 */
public class SistemaPagamento {
    public static void main(String[] args) {
        GerenciamentoPagamentos gerenciamento = new GerenciamentoPagamentos(5);

        gerenciamento.adicionarPagamento(new Dinheiro(100.00));
        gerenciamento.adicionarPagamento(new CartaoCredito(200.00, 3));
        gerenciamento.adicionarPagamento(new Cheque(300.00, false));
        gerenciamento.adicionarPagamento(new Dinheiro(50.00));
        gerenciamento.adicionarPagamento(new CartaoCredito(150.00, 1));

        gerenciamento.exibirRelatorio();
    }
}

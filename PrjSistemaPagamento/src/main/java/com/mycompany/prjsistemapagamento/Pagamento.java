
package com.mycompany.prjsistemapagamento;

abstract class Pagamento {
    protected double valorTotal;

    public Pagamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public abstract double calcularValorFinal();
}

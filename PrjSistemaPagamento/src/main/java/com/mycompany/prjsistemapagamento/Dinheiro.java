
package com.mycompany.prjsistemapagamento;

class Dinheiro extends Pagamento {

    public Dinheiro(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public double calcularValorFinal() {
        return valorTotal * 0.90; // 10% de desconto
    }
}


package com.mycompany.prjsistemapagamento;

class CartaoCredito extends Pagamento {
    private int numeroParcelas;

    public CartaoCredito(double valorTotal, int numeroParcelas) {
        super(valorTotal);
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double calcularValorFinal() {
        double valorFinal = valorTotal;
        if (numeroParcelas > 1) {
            valorFinal += valorTotal * 0.02 * (numeroParcelas - 1); // 2% de acréscimo por parcela adicional
        }
        return valorFinal;
    }
}

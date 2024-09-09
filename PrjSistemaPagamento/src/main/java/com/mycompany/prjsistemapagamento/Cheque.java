
package com.mycompany.prjsistemapagamento;

class Cheque extends Pagamento {
    private boolean aprovado;

    public Cheque(double valorTotal, boolean aprovado) {
        super(valorTotal);
        this.aprovado = aprovado;
    }

    @Override
    public double calcularValorFinal() {
        if (aprovado) {
            return valorTotal; // Sem alteração
        } else {
            return valorTotal * 1.20; // 20% de multa
        }
    }
}

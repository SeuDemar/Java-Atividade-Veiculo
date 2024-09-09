
package com.mycompany.prjsistemapagamento;
/**
 *
 * @author Vitor
 */
public class GerenciamentoPagamentos {
    private Pagamento[] pagamentos;
    private int contador;

    public GerenciamentoPagamentos(int capacidade) {
        pagamentos = new Pagamento[capacidade];
        contador = 0;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        if (contador < pagamentos.length) {
            pagamentos[contador++] = pagamento;
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    public void exibirRelatorio() {
        System.out.println("Relatorio de Pagamentos:");
        for (int i = 0; i < contador; i++) {
            Pagamento pagamento = pagamentos[i];
            System.out.println("Valor Final: R$" + pagamento.calcularValorFinal());
        }
    }
}

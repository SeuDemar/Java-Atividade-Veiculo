
package com.mycompany.prjgerenciamentoveiculos;


public class Caminhao extends Veiculo implements IPesado {
    
    protected double pesoCarga;
    protected int eixos;

    public Caminhao(String placa, String marca, String modelo, double valorDiaria, double pesoCarga, int eixos) {
        super(placa, marca, modelo, valorDiaria);
        this.pesoCarga = pesoCarga;
        this.eixos = eixos;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valor = dias * valorDiaria;  
        if (eixos > 2) {
            valor += valor * (eixos * 0.02);
        }

        return valor;
    }

    @Override
    public int calcularTaxaPeso() {
        return (int) (pesoCarga * 0.0005);
    }
    
}

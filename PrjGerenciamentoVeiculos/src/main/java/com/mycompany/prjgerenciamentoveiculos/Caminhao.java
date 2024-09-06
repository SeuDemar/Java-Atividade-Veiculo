
package com.mycompany.prjgerenciamentoveiculos;


public class Caminhao extends Veiculo implements IPesado {
    
    protected double pesoCarga;
    protected int eixos;

    @Override
    public double calcularAluguel(int dias) {
        
        if (eixos > 2){
             return (eixos -2)(valorDiaria + (dias * (valorDiaria - (valorDiaria *(5/100)))));
         }
         return dias * valorDiaria;
    }

    @Override
    public int calcularTaxaPeso() {
        return 0;
    }
    
}

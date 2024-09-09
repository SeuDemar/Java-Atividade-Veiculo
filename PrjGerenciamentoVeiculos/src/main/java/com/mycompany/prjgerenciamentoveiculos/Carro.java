
package com.mycompany.prjgerenciamentoveiculos;


public class Carro extends Veiculo implements IPassageiro{

    protected int numeroPortas;

    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroPortas) {
        super(placa, marca, modelo, valorDiaria);
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public double calcularAluguel(int dias) {
        
         if (dias > 7){
             return valorDiaria + (dias * (valorDiaria - (valorDiaria *(5/100))));
         }
         
         return dias * valorDiaria;
    }

    @Override
    public double calcularCapacidade() {
        return 5; 
    }
    
}

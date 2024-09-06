
package com.mycompany.prjgerenciamentoveiculos;


public class Moto extends Veiculo implements IPassageiro {
    
    protected boolean sideCar;
    
    @Override
    public double calcularAluguel(int dias) {
        
        if (dias > 7){
             return valorDiaria + (dias * (valorDiaria - (valorDiaria *(5/100))));
         }
         return dias * valorDiaria;
    }

    @Override
    public double calcularCapacidade() {
        if(sideCar == true){
            return 3;
        } 
        
        return 2;
    }  
}

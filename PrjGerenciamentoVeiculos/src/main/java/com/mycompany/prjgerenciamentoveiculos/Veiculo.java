
package com.mycompany.prjgerenciamentoveiculos;

public abstract class Veiculo {
    
    protected String placa;
    protected String marca;
    protected String modelo;
    protected double valorDiaria; 
   
    public abstract double calcularAluguel(int dias);
}

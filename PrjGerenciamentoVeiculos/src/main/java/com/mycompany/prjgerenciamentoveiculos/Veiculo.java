
package com.mycompany.prjgerenciamentoveiculos;

public abstract class Veiculo {
    
    protected String placa;
    protected String marca;
    protected String modelo;
    protected double valorDiaria; 
   
    public abstract double calcularAluguel(int dias);
    
    public Veiculo(String placa, String marca, String modelo, double valorDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
}

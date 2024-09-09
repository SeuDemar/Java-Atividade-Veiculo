
package com.mycompany.prjgerenciamentoveiculos;

public class GerenciamentoVeiculos {


    public static void main(String[] args) {

        // Adicionando objetos (Carro, Moto, Caminhao) ao array
         Veiculo[] veiculos = new Veiculo[]{
            new Carro("ABC-1234", "Toyota", "Corolla", 150, 5),
            new Moto("XYZ-5678", "Honda", "CB500", 100, true),
            new Caminhao("LMN-9876", "Scania", "R450", 300, 15000, 4)
        };


        for (Veiculo veiculo : veiculos) {
            
            if (veiculo instanceof Caminhao) {
                Caminhao caminhao = (Caminhao) veiculo;
                System.out.println("--Caminhao--");
                System.out.println("Placa: " + veiculo.placa);
                System.out.println("Marca: " + veiculo.marca);
                System.out.println("Modelo: " + veiculo.modelo);
                System.out.println("Valor da Diaria: R$" + veiculo.valorDiaria);
                System.out.println("Numero de Eixos: " + caminhao.eixos);
                System.out.println("Taxa de Peso: R$" + caminhao.calcularTaxaPeso());
            } else if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                System.out.println("--Moto--");
                System.out.println("Placa: " + veiculo.placa);
                System.out.println("Marca: " + veiculo.marca);
                System.out.println("Modelo: " + veiculo.modelo);
                System.out.println("Valor da Diaria: R$" + veiculo.valorDiaria);
                System.out.println("Sidecar: " + moto.sideCar);
                System.out.println("Capacidade de Passageiros: " + moto.calcularCapacidade());
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                System.out.println("--Carro--");
                System.out.println("Placa: " + veiculo.placa);
                System.out.println("Marca: " + veiculo.marca);
                System.out.println("Modelo: " + veiculo.modelo);
                System.out.println("Valor da Diária: R$" + veiculo.valorDiaria);
                System.out.println("Número de Portas: " + carro.numeroPortas);
                System.out.println("Capacidade de Passageiros: " + carro.calcularCapacidade());
            }
        }
    }
}

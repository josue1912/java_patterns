package br.com.java.pattern.strategy;

public class CalculoDiaria implements CalculoValor {
    private double valorDiaria;

    public CalculoDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }

    public double calcular(long periodo, Veiculo veiculo){
        return valorDiaria * Math.ceil(periodo * 60);
    }
}

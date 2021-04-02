package br.com.java.pattern.strategy;

public class ContaEstacionamento {
    private CalculoValor calculo;
    private Veiculo veiculo;
    private long inicio;
    private long fim;

    public ContaEstacionamento(CalculoValor calculo, Veiculo veiculo, long inicio, long fim){
        this.calculo = calculo;
        this.veiculo = veiculo;
        this.inicio = inicio;
        this.fim = fim;
    }

    public double valorConta(){
        return calculo.calcular(fim-inicio, veiculo);
    }
    
}

package br.com.java.pattern.strategy;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaEstacionamento ce = new ContaEstacionamento(new CalculoDiaria(29l), null, 8, 10);

        System.out.println(ce.valorConta());


    }
}

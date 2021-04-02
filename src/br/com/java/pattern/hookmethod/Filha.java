package br.com.java.pattern.hookmethod;

public class Filha extends Mae {

    @Override
    public void hookmethod() {
        System.out.println("Executei a operação no hook method");

    }
    
}

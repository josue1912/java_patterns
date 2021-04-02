package br.com.java.pattern.hookmethod;

public abstract class Mae {
    
    public void principal(){
        System.out.println("Iniciei o método principal");
        hookmethod();
        System.out.println("Finalizei o método principal");
    }

    public abstract void hookmethod();
}

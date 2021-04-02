package br.com.java.pattern.nullobject;

public class CarrinhoNulo extends Carrinho {
    
    public Double getValor(){
        return 0.0;
    }

    public Integer getTamanho(){
        return 0;
    }

    public String getNomeUsuario(){
        return "<a href=login.jsp>Login</a>";
    }
}

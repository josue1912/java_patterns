package br.com.java.pattern.nullobject;

public class Carrinho {

    private Double valor;
    private Integer tamanho;
    private String nomeUsuario;

    public Double getValor() {
        return valor;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

}

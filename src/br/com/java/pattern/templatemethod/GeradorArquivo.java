package br.com.java.pattern.templatemethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {

    public final void gerarArquivo(String nome, Map<String, Object> propriedades) throws Exception {
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = processar(bytes);
        FileOutputStream fileOut = new FileOutputStream(nome);
        fileOut.write(bytes);
        fileOut.close();
    }

    protected byte[] processar(byte[] bytes) throws IOException {
        return bytes;
    }

    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}

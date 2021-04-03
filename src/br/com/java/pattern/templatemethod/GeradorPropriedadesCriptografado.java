package br.com.java.pattern.templatemethod;

import java.io.IOException;
import java.util.Map;

public class GeradorPropriedadesCriptografado extends GeradorArquivo {

    private int delay;
    
    public GeradorPropriedadesCriptografado(int delay) {
        this.delay = delay;
    }
        
    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        for(String prop: propriedades.keySet()){
            propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
        }
        return propFileBuilder.toString();
    }

    protected byte[] processar(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        for(int i=0; i<bytes.length; i++){
            newBytes[i] = (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
   
}

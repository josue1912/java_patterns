package br.com.java.pattern.templatemethod;

import java.util.HashMap;
import java.util.Map;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Map<String, Object> propriedades = new HashMap<>();
        propriedades.put("chave1", "Valor 1");
        propriedades.put("chave2", "Valor 2");
        
        GeradorArquivo geradorXmlCompactado = new GeradorXMLCompactado();
        geradorXmlCompactado.gerarArquivo("ArquivoCompactado", propriedades);

        GeradorArquivo geradorCriptografado = new GeradorPropriedadesCriptografado(5);
        geradorCriptografado.gerarArquivo("ArquivoCriptografado", propriedades);

    }
}

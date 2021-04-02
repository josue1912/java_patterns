package br.com.java.pattern.nullobject;

import javax.servlet.http.HttpServletRequest;

public class ApresentacaoCarrinho {
    
    public void colocarInformacoesCarrinho(final HTTPServletRequest request){
        
        final Carrinho c = CookieFactory.criarCarrinho(request);
        
        request.setAttribute("valor", c.getValor());
        request.setAttribute("qtd", c.getTamanho());
 

        if(request.getAttribute("username") == null) {
            request.setAttribute("userCarrinho", c.getNomeUsuario());
        } else {
            request.setAttribute("userCarrinho", request.getAttribute("username"));
        }
    }
}

package br.com.java.pattern.nullobject;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieFactory {
    
    public Carrinho criarCarrinho(HttpServletRequest request){

        Cookie [] cookies = request.getCookies();

        for(int i=0; i<cookies.length; i++){
            Cookie cookie = cookies[i];
            if(cookie.getName().equals("Carrinho")){
                return cookie.getValue();
            }
            return new CarrinhoNulo();
        }
    }
}

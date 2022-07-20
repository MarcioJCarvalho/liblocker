package br.com.mjc;

import br.com.mjc.controller.BibliotecarioLoginController;
import org.junit.Assert;
import org.junit.Test;

public class TesteBibliotecarioLogin {
    private String siape = "siape";
    private String senha = "12345678";
    
    @Test
    public void testeLogin(){
        String resultado = BibliotecarioLoginController.logar(siape, senha);
        Assert.assertEquals("Logado com sucesso!", resultado);
    }
    
    @Test
    public void testeSiape(){
        String resultado = BibliotecarioLoginController.logar("siapeinvalido", senha);
        Assert.assertEquals("Senha incorréta!", resultado);
    }
    
    @Test
    public void testeSenha(){
        String resultado = BibliotecarioLoginController.logar(siape, "senhainvalida");
        Assert.assertEquals("Siape inexistente!", resultado);
    }
    ;
}

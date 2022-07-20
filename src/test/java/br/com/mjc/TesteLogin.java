package br.com.mjc;
import br.com.mjc.controller.LoginController;
import org.junit.Test;
import org.junit.Assert;
public class TesteLogin {
    private String email = "genericemail@email.com";
    private String senha = "12345678";
    
    @Test
    public void authOk(){
        String resultado = LoginController.auth(email, senha);
        Assert.assertEquals("Logado com sucesso!", resultado);  
    }
    
    @Test
    public void emailInvalido(){
        String resultado = LoginController.auth("emailinvalido@email.com", senha);
        Assert.assertEquals("E-mail inválido!", resultado);
    }
    
    @Test
    public void senhaInvalida(){
        String resultado = LoginController.auth(email, "senhainvalida");
        Assert.assertEquals("Senha inválida!", resultado);
    }
}

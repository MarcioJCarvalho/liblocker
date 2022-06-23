package br.com.mjc;

import br.com.mjc.controller.LoginController;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void authOk() {
        String email = "emailesperado@email.com";
        String senha = "senhacorreta";
        LoginController loginController = new LoginController();
        
        String result = loginController.auth(email, senha);
        Assert.assertEquals("Sucesso no login", result);
    }
}

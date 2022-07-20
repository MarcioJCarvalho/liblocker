package br.com.mjc;

import br.com.mjc.controller.EmprestimoController;
import org.junit.Assert;
import org.junit.Test;

public class TesteEmprestimo {
    private String chave = "01";
    private String ra = "ra_aluno";
    private String senha = "senha_aluno";
    
    @Test
    public void testeEmprestimo(){
        String resultado = EmprestimoController.emprestar(chave, ra, senha);
        Assert.assertEquals("Emprestimo realizado com sucesso!", resultado);
    }
    
    @Test
    public void testeRa() {
        String resultado = EmprestimoController.emprestar(chave, "ra_invalido", senha);
        Assert.assertEquals("RA inválido!", resultado);
    }
    
    @Test
    public void testeSenha() {
        String resultado = EmprestimoController.emprestar(chave, ra, "senha_invalida");
        Assert.assertEquals("Senha inválida!", resultado);
    }
    
    @Test
    public void testeChave() {
        String resultado = EmprestimoController.emprestar("chave_invalida", ra, senha);
        Assert.assertEquals("Impossivel realizar emprestimo! verifique as informações", resultado);
    }
}

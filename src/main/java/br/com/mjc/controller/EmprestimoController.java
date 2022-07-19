package br.com.mjc.controller;
import br.com.mjc.service.EmprestimoService;

public class EmprestimoController {
    public static String emprestar(String nChave, String ra, String senha){
        return EmprestimoService.emprestimoOk(nChave, ra, senha);
    }
}

package br.com.mjc;

public class Bibliotecario extends Pessoa{
    private String siape;


    public Bibliotecario() {
    }


    public Bibliotecario(String siape) {
        this.siape = siape;
    }


    public String getSiape() {
        return this.siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

}

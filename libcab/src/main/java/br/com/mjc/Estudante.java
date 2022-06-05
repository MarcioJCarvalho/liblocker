package br.com.mjc;

public class Estudante extends Pessoa{
    private String ra;


    public Estudante() {
    }
  

    public Estudante(String ra) {
        this.ra = ra;
    }


    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

}

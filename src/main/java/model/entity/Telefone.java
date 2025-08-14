package model.entity;

public class Telefone {
    private  boolean id;
    private short ddd;
    private String numero;
    private boolean codStatus;


    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public short getDdd() {
        return ddd;
    }

    public void setDdd(short ddd) {
        this.ddd = ddd;
    }
}

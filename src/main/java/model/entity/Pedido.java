package model.entity;

public class Pedido {
    private long id;
    private double valor;
    private int dataHoraPedido;
    private int dataHoraEntrega;
    private boolean Status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public int getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(int dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public int getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(int dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}


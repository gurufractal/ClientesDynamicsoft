package com.dynamicsoft.clientesdynamicsoft;

public class ClienteModelo {
    private String cliente, codigo, estatus;
    private int fachadaCliente;

    public ClienteModelo() {

    }

    public ClienteModelo(String cliente, String codigo, String estatus,int fachadaCliente) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.estatus = estatus;
        this.fachadaCliente = fachadaCliente;

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getFachadaCliente() {
        return fachadaCliente;
    }

    public void setFachadaCliente(int fachadaCliente) {
        this.fachadaCliente = fachadaCliente;
    }


}

package com.dynamicsoft.clientesdynamicsoft;

public class ClienteModelo {
    private String cliente, codigo;
    private int fachadaCliente;

    public ClienteModelo() {

    }

    public ClienteModelo(String cliente, String codigo, int fachadaCliente) {
        this.cliente = cliente;
        this.codigo = codigo;
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

    public int getFachadaCliente() {
        return fachadaCliente;
    }

    public void setFachadaCliente(int fachadaCliente) {
        this.fachadaCliente = fachadaCliente;
    }
}

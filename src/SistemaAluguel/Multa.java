package SistemaAluguel;

public class Multa {
    private int codigoMulta;
    private int codigoCliente;
    private double valor;

    public Multa(int codigoMulta, int codigoCliente, double valor) {
        this.codigoMulta = codigoMulta;
        this.codigoCliente = codigoCliente;
        this.valor = valor;
    }

    public int getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(int codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

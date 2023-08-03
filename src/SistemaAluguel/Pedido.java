package SistemaAluguel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int codigoPedido;
    private int codigoCliente;
    private int codigoFuncionario;
    private ArrayList<Item> itens;
    private double valorPedido;
    private Date dataPedido;
    private Date dataDevolucao;
    private int prazo;

    public Pedido(int codigoPedido, int codigoCliente, int codigoFuncionario, ArrayList<Item> itens, double valorPedido, Date dataPedido, Date dataDevolucao, int prazo) {
        this.codigoPedido = codigoPedido;
        this.codigoFuncionario = codigoFuncionario;
        this.itens = itens;
        this.valorPedido = calculaTotal(itens);
        this.dataPedido = dataPedido;
        this.dataDevolucao = dataDevolucao;
        this.prazo = prazo;
    }

    public double calculaTotal(ArrayList<Item> itens){
        double total = 0;
        for (Item i: itens){
            total += i.getValorAluguel();

        }
        return total;
    }
    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}

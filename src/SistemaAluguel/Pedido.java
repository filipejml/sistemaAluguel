package SistemaAluguel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private int codigoPedido;
    private int codigoCliente;
    private int codigoFuncionario;
    private ArrayList<Item> itens;
    private double valorPedido;
    private String dataPedido;
    private String dataDevolucao;
    private int prazo;

    public Pedido(int codigoPedido, int codigoCliente, int codigoFuncionario, ArrayList<Item> itens, double valorPedido, String dataPedido, String dataDevolucao, int prazo) {
        this.codigoPedido = codigoPedido;
        this.codigoFuncionario = codigoFuncionario;
        this.itens = itens;
        this.valorPedido = calculaTotal(itens);
        this.dataPedido = dataPedido;
        this.prazo = prazo;
        this.dataDevolucao = setDataDevolucao(this.dataPedido, this.prazo);
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

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public String setDataDevolucao(String dataPedido, int prazo) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime data = LocalDateTime.parse(dataPedido, formatter);
        data = data.plusDays(prazo);
        String dataDevolucao = data.format(formatter);
        return dataDevolucao;

    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}

package SistemaAluguel;

public class Item {
    private String nome;
    private int codigo;
    private int categoria;
    private int quantidade;
    private String tamanho;
    private double valorAluguel;

    public Item(String nome, int codigo, int categoria, int quantidade, String tamanho, double valorAluguel) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.tamanho = tamanho;
        this.valorAluguel = valorAluguel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}

package SistemaAluguel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque e = new Estoque();

        int quantidade = 0;

        Funcionario Filipe = new Funcionario("Filipe", 1);

        Cliente Lucas = new Cliente(1, "Lucas","05938808383", "86988347800");

        Item Item1 = new Item("Calça Comprida Masculina", 1, 1,1,"P", 20);
        e.adicionaItem(Item1);
        Item Item2 = new Item("Sapato Social", 2,2,2,"38", 10);
        e.adicionaItem(Item2);
        Item Item3 = new Item("Terno", 3, 2, 3,"M", 50);
        e.adicionaItem(Item3);

        ArrayList<Integer> codigoItens = new ArrayList<Integer>();
        ArrayList<Item> listaItens = new ArrayList<Item>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de itens no pedido: ");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){
            System.out.print("Informe o código do produto " + (i+1) + ":" );
            int codigo = sc.nextInt();
            codigoItens.add(codigo);
        }

        for(int cod : codigoItens){
            Item item = e.buscaItem(cod);
            if(item != null){
                listaItens.add(item);
            }
        }

        Pedido Aluguel1 = new Pedido(1,1, 1, listaItens, 0, null, null, 0);
        System.out.println("Valor aluguel: " + Aluguel1.getValorPedido());
    }
}
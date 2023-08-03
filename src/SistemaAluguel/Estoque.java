package SistemaAluguel;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Item> itens = new ArrayList<Item>();

    public void adicionaItem(Item i){
        itens.add(i);
    }

    public Item buscaItem(int cod){
        for(Item i : itens){
            if(i.getCodigo() == cod){
                return i;
            }
        }
        return null;
    }

}

package trabalho;

import java.util.ArrayList;

public class Fornecedora extends Empresa{
    private ArrayList<Vinho> listaVinhosFornecidos = new ArrayList<>();

    public Fornecedora(String CNPJ, String nome, String endereco, String telefone, String nomeFantasia){
        super(CNPJ, nome, endereco, telefone, nomeFantasia);
    }

    public Fornecedora(){}

    public ArrayList<Vinho> getListaVinhosFornecidos() {
        return listaVinhosFornecidos;
    }

    public void setListaVinhosFornecidos(ArrayList<Vinho> listaVinhosFornecidos) {
        this.listaVinhosFornecidos = listaVinhosFornecidos;
    }

    public void addVinho(Vinho vinho){
        this.listaVinhosFornecidos.add(vinho);
    }
}

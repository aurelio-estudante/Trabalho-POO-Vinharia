package trabalho;

public class Estoque {
    private Vinho vinho;
    private int quantidade;

    public Estoque(Vinho vinho, int quantidade){
        this.vinho = vinho;
        this.quantidade = quantidade;
    }

    public Vinho getVinho() {
        return vinho;
    }

    public void setVinho(Vinho vinho) {
        this.vinho = vinho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}

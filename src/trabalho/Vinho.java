package trabalho;

public class Vinho {
    private String nome;
    private double preco;
    private int ano;
    private int numSafra;
    private int idade;
    private Fornecedora fornecedora;

    public Vinho(String nome, double preco, int ano, int numSafra, int idade, Fornecedora fornecedora){
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
        this.numSafra = numSafra;
        this.idade = idade;
        this.fornecedora = fornecedora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumSafra() {
        return numSafra;
    }

    public void setNumSafra(int numSafra) {
        this.numSafra = numSafra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Empresa getFornecedora() {
        return fornecedora;
    }

    public void setFornecedora(Fornecedora fornecedora) {
        this.fornecedora = fornecedora;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+" Preco: "+ preco+ " Idade: "+idade+" Fornecedora: "+this.fornecedora.getNome()+" CNPJ da Fornecedora: "+this.fornecedora.CNPJ;
    }
    
}

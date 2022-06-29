package trabalho;

import java.util.ArrayList;

public class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected int idade;
    protected String cpf;
    protected Double conta;
    protected ArrayList<Double> contas = new ArrayList<>();

    public Pessoa(String nome, String telefone, String email, int idade, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
        this.conta = 0.0;
    }

    public Pessoa(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    };
    
    public ArrayList<Double> getContas(){
        return this.contas;
    }
    public void pagarConta() throws Exception{
        if(conta!=0.0){
            this.contas.add(this.conta);
            this.conta=0.0;
        }
        else{
            throw new Exception("A conta está vazia!");
        }
        
    }
}

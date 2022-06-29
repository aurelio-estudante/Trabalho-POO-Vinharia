package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Vinharia extends Empresa{
    private String usuarioAdmin;
    private String senhaAdmin;
    private ArrayList<Estoque> listaVinhos = new ArrayList<>();
    private ArrayList<Fornecedora> listaFornecedoras = new ArrayList<>();
    private ArrayList<Pessoa> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Vinharia(String CNPJ, String nome, String endereco, String telefone, String nomeFantasia,String usuarioAdmin, String senhaAdmin){
        super(CNPJ, nome, endereco, telefone, nomeFantasia);
        this.usuarioAdmin = usuarioAdmin;
        this.senhaAdmin = senhaAdmin;
    }

    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public String getSenhaAdmin() {
        return senhaAdmin;
    }

    public void setSenhaAdmin(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
    }

    public ArrayList<Estoque> getListaVinhos() {
        return listaVinhos;
    }

    public void setListaVinhos(ArrayList<Estoque> listaVinhos) {
        this.listaVinhos = listaVinhos;
    }

    public void addVinho(Estoque vinhoEstoque){
        this.listaVinhos.add(vinhoEstoque);
    }

    public ArrayList<Fornecedora> getListaFornecedoras() {
        return listaFornecedoras;
    }

    public void setListaFornecedoras(ArrayList<Fornecedora> listaFornecedoras) {
        this.listaFornecedoras = listaFornecedoras;
    }

    public void addFornecedora(Fornecedora fornecedora){
        this.listaFornecedoras.add(fornecedora);
    }

    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Pessoa> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Pessoa cliente){
        this.clientes.add(cliente);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void imprimeEstoque() throws ListaVaziaException{
        if(listaVinhos.size()>0){
            for (int i = 0; i < listaVinhos.size(); i++) {
                Vinho temp = listaVinhos.get(i).getVinho();
                System.out.println("Vinho: "+temp.getNome()+" Safra: "+temp.getNumSafra()+" Quantidade: "+listaVinhos.get(i).getQuantidade());
            }
        }else{
            throw new ListaVaziaException();
        }
    }

    public void imprimeFornecedoras() throws ListaVaziaException{
        if(listaFornecedoras.size()>0){
            for (int i = 0; i < listaFornecedoras.size(); i++) {
                Fornecedora temp = listaFornecedoras.get(i);
                System.out.println((i+1)+"Fornecedora: "+temp.getNomeFantasia()+" CNPJ: "+temp.getCNPJ());
            }
        }else{
            throw new ListaVaziaException();
        }
    }

    public void imprimeClientes() throws ListaVaziaException{
        if(clientes.size()>0){
            for (int i = 0; i < clientes.size(); i++) {
                Pessoa temp = clientes.get(i);
                System.out.println((i+1)+" - "+"Cliente: "+temp.getNome()+ " CPF: "+temp.getCpf() + " Conta: "+temp.getConta());
            }
        }else{
            throw new ListaVaziaException();
        }
    }

    public void imprimeFuncionarios() throws ListaVaziaException{
        if(funcionarios.size()>0){
            for (int i = 0; i < funcionarios.size(); i++) {
                Funcionario temp = funcionarios.get(i);
                System.out.println("Funcionario: "+temp.getNome()+ " CPF: "+temp.getCpf()+" Permissão: "+temp.getPermissao());
            }
        }else{
            throw new ListaVaziaException();
        }
    }
    public void venderVinho() throws Exception{
        int vinhoEscolhido;
        int clienteEscolhido;
        int quantidadeVendida;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o vinho: ");
        if(listaVinhos.size()>0){
            for (int i = 0; i < listaVinhos.size(); i++) {
                System.out.println("Opção "+(i+1)+":");
                System.out.println("Vinho: "+listaVinhos.get(i).getVinho());
                System.out.println("Quantidade: "+listaVinhos.get(i).getQuantidade());
                System.out.println("-----------");
            }
            System.out.println("Escolha: ");
            vinhoEscolhido = (scan.nextInt())-1;

            System.out.println("Escolha o cliente para vender: ");
            try {
                imprimeClientes();
                System.out.println("Escolha: ");
                clienteEscolhido = (scan.nextInt())-1;

                System.out.println("Insira a quantidade a vender: ");
                quantidadeVendida = scan.nextInt();
                if(listaVinhos.get(vinhoEscolhido).getQuantidade()-quantidadeVendida<0){
                    scan.close();
                    throw new Exception("Quantidade a ser vendida maior que a quantidade disponível.");
                }else{
                    listaVinhos.get(vinhoEscolhido).setQuantidade((listaVinhos.get(vinhoEscolhido).getQuantidade())-1);
                    double valorVenda = listaVinhos.get(vinhoEscolhido).getVinho().getPreco()*quantidadeVendida;
                    clientes.get(clienteEscolhido).setConta(clientes.get(clienteEscolhido).getConta()+valorVenda);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Não há clientes para quem vender!");
            }
        }else{
            scan.close();
            throw new ListaVaziaException();
        }
        scan.close();
    }
}

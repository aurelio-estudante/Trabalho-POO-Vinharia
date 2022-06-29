package main;

import java.util.ArrayList;
import java.util.Scanner;

import trabalho.Estoque;
import trabalho.Fornecedora;
import trabalho.Funcionario;
import trabalho.Pessoa;
import trabalho.Vinharia;
import trabalho.Vinho;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        int menuPrincipal = 0;
        ArrayList<Fornecedora> fornecedoras = new ArrayList<>();
        ArrayList<Pessoa> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Vinho> vinhos = new ArrayList<>();

        String cnpj = "";
        String nome = "";
        String endereco = "";
        String telefone = "";
        String nomeFantasia = "";
        String usuarioAdmin = "";
        String senhaAdmin = "";
        String email;
        int idade;
        String cpf;
        String usuario;
        String senha;
        int permissao;
        Double salario;
        Double preco;
        int ano;
        int numSafra;
        int selectFornecedora;

        Vinharia vinharia = new Vinharia(cnpj, nome, endereco, telefone, nomeFantasia, usuarioAdmin, senhaAdmin);

        /*
         * Pré Cadastros
         */

        Fornecedora fornecedoraMaravilha = new Fornecedora("11111111", "FM VINHOS", "Rua 2 Bairro 1 Centro", "2222-2222", "Fornecedora Maravilha");
        vinharia.addFornecedora(fornecedoraMaravilha);
        Pessoa cliente1 = new Pessoa("Joaquim", "2222-2222", "emailmassa@email.com", 23, "3183183486");
        vinharia.addCliente(cliente1);
        Funcionario chefe = new Funcionario("Chefe", "3333-3333", "emailchefe@email.com", 42, "684864686", "usuarioChefe", "senhaChefe", 4, 2356.50);
        funcionarios.add(chefe);
        Vinho vinho1 = new Vinho("Vinho Bom", 849.90, 1984, 12, 38, fornecedoraMaravilha);
        vinhos.add(vinho1);
        //
        System.out.println("-------------- Cadastro de Vinharia --------------");
        System.out.println("1 - Insira o CNPJ: ");
        cnpj = scan.nextLine();
        vinharia.setCNPJ(cnpj);
        System.out.println("2 - Insira o nome: ");
        nome = scan.nextLine();
        vinharia.setNome(nome);
        System.out.println("3 - Insira o endereco: ");
        endereco = scan.nextLine();
        vinharia.setEndereco(endereco);
        System.out.println("4 - Insira o telefone: ");
        telefone = scan.nextLine();
        vinharia.setTelefone(telefone);
        System.out.println("5 - Insira o nome fantasia: ");
        nomeFantasia = scan.nextLine();
        vinharia.setNomeFantasia(nomeFantasia);
        System.out.println("6 - Insira o nome do usuario administrador: ");
        usuarioAdmin = scan.nextLine();
        vinharia.setUsuarioAdmin(usuarioAdmin);
        System.out.println("7 - Insira a senha do usuario administrador: ");
        senhaAdmin = scan.nextLine();
        vinharia.setSenhaAdmin(senhaAdmin);
        System.out.println("---------------------------------------------");

        while(menuPrincipal!=5){
            System.out.println("-------------- Menus --------------");
            System.out.println("1 - Cadastros");
            System.out.println("2 - Checagem");
            System.out.println("3 - Estoque");
            System.out.println("4 - Venda");
            System.out.println("5 - Sair");
            System.out.println("Escolha: ");
            menuPrincipal = scan.nextInt();
            System.out.println("------------------------------------");

            switch (menuPrincipal) {

                case 1:
                    System.out.println("-------------- Menu de Cadastro --------------");
                    System.out.println("1 - Cadastro de Fornecedora");
                    System.out.println("2 - Cadastro de Cliente");
                    System.out.println("3 - Cadastro de Funcionario");
                    System.out.println("4 - Cadastro de Vinho");
                    System.out.println("5 - Retornar");
                    System.out.println("Escolha: ");
                    menu = scan.nextInt();
                    System.out.println("----------------------------------------------");
                    switch (menu) {
                        case 1:
                            scan.nextLine();
                            System.out.println("-------------- Cadastro de Fornecedora --------------");
                            System.out.println("1 - Insira o CNPJ: ");
                            cnpj = scan.nextLine();
                            System.out.println("2 - Insira o nome: ");
                            nome = scan.nextLine();
                            System.out.println("3 - Insira o endereco: ");
                            endereco = scan.nextLine();
                            System.out.println("4 - Insira o telefone: ");
                            telefone = scan.nextLine();
                            System.out.println("5 - Insira o nome fantasia: ");
                            nomeFantasia = scan.nextLine();
                            Fornecedora fornecedora = new Fornecedora(cnpj, nome, endereco, telefone, nomeFantasia);
                            fornecedoras.add(fornecedora);
                            System.out.println("---------------------------------------------");
                            break;
                        case 2:
                            scan.nextLine();
                            System.out.println("-------------- Cadastro de Cliente --------------");
                            System.out.println("1 - Insira o CPF: ");
                            cpf = scan.nextLine();
                            System.out.println("2 - Insira o nome: ");
                            nome = scan.nextLine();
                            System.out.println("3 - Insira o email: ");
                            email = scan.nextLine();
                            System.out.println("4 - Insira o telefone: ");
                            telefone = scan.nextLine();
                            System.out.println("5 - Insira a idade: ");
                            idade = scan.nextInt();
                            Pessoa cliente = new Pessoa(nome, telefone, email, idade, cpf);
                            clientes.add(cliente);
                            System.out.println("---------------------------------------------");
                            break;
                        case 3:
                            scan.nextLine();
                            System.out.println("-------------- Cadastro de Funcionario --------------");
                            System.out.println("1 - Insira o CPF: ");
                            cpf = scan.nextLine();
                            System.out.println("2 - Insira o nome: ");
                            nome = scan.nextLine();
                            System.out.println("3 - Insira o email: ");
                            email = scan.nextLine();
                            System.out.println("4 - Insira o telefone: ");
                            telefone = scan.nextLine();
                            System.out.println("5 - Insira a idade: ");
                            idade = scan.nextInt();
                            scan.nextLine();
                            System.out.println("6 - Insira o usuario: ");
                            usuario = scan.nextLine();
                            System.out.println("7 - Insira a senha: ");
                            senha = scan.nextLine();
                            System.out.println("8 - Insira a permissao: ");
                            permissao = scan.nextInt();
                            System.out.println("9 - Insira o salario: ");
                            salario = scan.nextDouble();
                            Funcionario funcionario = new Funcionario(nome, telefone, email, idade, cpf, usuario, senha,permissao, salario);
                            funcionarios.add(funcionario);
                            System.out.println("---------------------------------------------");
                            break;
                        case 4:
                            scan.nextLine();
                            System.out.println("-------------- Cadastro de Vinho --------------");
                            System.out.println("Insira o nome do vinho: ");
                            nome = scan.nextLine();
                            System.out.println("Insira o preco do vinho: ");
                            preco = scan.nextDouble();
                            System.out.println("Insira o ano do vinho: ");
                            ano = scan.nextInt();
                            System.out.println("Insira o numero da safra: ");
                            numSafra = scan.nextInt();
                            System.out.println("Insira a idade do vinho: ");
                            idade = scan.nextInt();
                            System.out.println("-- Selecione a fornecedora --");
                            try {
                                vinharia.imprimeFornecedoras();
                                System.out.println("Escolha: ");
                                selectFornecedora = scan.nextInt();
                                Vinho vinho = new Vinho(nome, preco, ano, numSafra, idade,
                                fornecedoras.get(selectFornecedora - 1));
                                fornecedoras.get(selectFornecedora-1).addVinho(vinho);
                                vinhos.add(vinho);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("Cadastre a fornecedora primeiro!");
                            }
                            System.out.println("---------------------------------------------");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("-------------- Menu de Checagem --------------");
                    System.out.println("1 - Checar Estoque");
                    System.out.println("2 - Checar Fornecedoras");
                    System.out.println("3 - Checar Clientes");
                    System.out.println("4 - Checar Funcionarios");
                    System.out.println("5 - Retornar");
                    System.out.println("Escolha: ");
                    menu = scan.nextInt();
                    System.out.println("----------------------------------------------");
                    switch (menu) {
                        case 1:
                            System.out.println("-------------- Estoque --------------");
                            try {
                                vinharia.imprimeEstoque();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("-------------------------------------");
                            break;
                        case 2:
                            System.out.println("-------------- Fornecedoras --------------");
                            try {
                                vinharia.imprimeFornecedoras();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("------------------------------------------");
                            break;
                        case 3:
                            System.out.println("-------------- Clientes --------------");
                            try {
                                vinharia.imprimeClientes();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("--------------------------------------");
                            break;
                        case 4:
                            System.out.println("-------------- Funcionarios --------------");
                            try {
                                vinharia.imprimeFuncionarios();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("------------------------------------------");
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("-------------- Menu de Estoque --------------");
                    System.out.println("1 - Checar Estoque");
                    System.out.println("2 - Adicionar Estoque");
                    System.out.println("3 - Retornar");
                    System.out.println("Escolha: ");
                    menu = scan.nextInt();
                    System.out.println("---------------------------------------------");
                    switch (menu) {
                        case 1:
                            System.out.println("-------------- Estoque --------------");
                            try {
                                vinharia.imprimeEstoque();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("-------------------------------------");
                            break;
                        case 2:
                            int vinhoEscolhido;
                            int quantidadeVinho;
                            System.out.println("-------------- Adicionar Estoque --------------");
                            System.out.println("Selecione o vinho para adicionar no estoque: ");
                            for(int i=0;i<vinhos.size();i++){
                                System.out.println((i+1)+" - "+vinhos.get(i));
                            }
                            System.out.println("Escolha: ");
                            vinhoEscolhido = scan.nextInt();
                            System.out.println("Digite a quantidade: ");
                            quantidadeVinho = scan.nextInt();
                            Estoque vinhoEstoque = new Estoque(vinhos.get(vinhoEscolhido-1), quantidadeVinho);
                            vinharia.addVinho(vinhoEstoque);
                            System.out.println("-----------------------------------------------");
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("-------------- Menu de Venda --------------");
                    System.out.println("1 - Vender Vinho");
                    System.out.println("2 - Checar Estoque");
                    System.out.println("3 - Pagar conta de um cliente");
                    System.out.println("4 - Retornar");
                    System.out.println("Escolha: ");
                    menu = scan.nextInt();
                    System.out.println("-------------------------------------------");
                    switch (menu) {
                        case 1:
                            try {
                                vinharia.venderVinho();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("-------------- Estoque --------------");
                            try {
                                vinharia.imprimeEstoque();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("-------------------------------------");
                            break;
                        case 3:
                            System.out.println("-------------- Clientes --------------");
                            int clienteSelecionado = 0;
                            try {
                                vinharia.imprimeEstoque();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("Selecione o cliente: ");
                            clienteSelecionado = scan.nextInt();
                            clienteSelecionado--;
                            try {
                                vinharia.getClientes().get(clienteSelecionado).pagarConta();
                                System.out.println("Conta paga!");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("--------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}

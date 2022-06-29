package trabalho;

public class Funcionario extends Pessoa{
    private String usuario;
    private String senha;
    private int permissao;
    private double salario;

    public Funcionario(String nome, String telefone, String email, int idade, String cpf, String usuario, String senha, int permissao, double salario){
        super(nome, telefone, email, idade, cpf);
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
        this.salario = salario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

}

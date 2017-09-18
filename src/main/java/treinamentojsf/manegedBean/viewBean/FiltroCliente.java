package treinamentojsf.manegedBean.viewBean;

public class FiltroCliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public FiltroCliente() {
    }

    public FiltroCliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}

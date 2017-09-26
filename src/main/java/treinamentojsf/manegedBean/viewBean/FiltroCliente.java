package treinamentojsf.manegedBean.viewBean;

public class FiltroCliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Boolean possuiEmprestimo;

    public FiltroCliente() {
    }

    public FiltroCliente(String nome, String cpf, String telefone, String email, Boolean possuiBoolean) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.possuiEmprestimo = possuiBoolean;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Boolean getPossuiEmprestimo() {
        return possuiEmprestimo;
    }

    public void setPossuiEmprestimo(Boolean possuiEmprestimo) {
        this.possuiEmprestimo = possuiEmprestimo;
    }
}

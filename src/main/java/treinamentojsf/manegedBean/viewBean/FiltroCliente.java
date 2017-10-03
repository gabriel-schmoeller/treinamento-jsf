package treinamentojsf.manegedBean.viewBean;

public class FiltroCliente {
    private String nomeEmail;
    private Boolean possuiEmprestimo;

    public FiltroCliente() {
        this.nomeEmail = "";
    }

    public FiltroCliente(String nomeEmail, Boolean possuiBoolean) {
        this.nomeEmail = nomeEmail;
        this.possuiEmprestimo = possuiBoolean;
    }

    public String getNomeEmail() {
        return nomeEmail;
    }

    public void setNomeEmail(String nomeEmail) {
        this.nomeEmail = nomeEmail;
    }

    public Boolean getPossuiEmprestimo() {
        return possuiEmprestimo;
    }

    public void setPossuiEmprestimo(Boolean possuiEmprestimo) {
        this.possuiEmprestimo = possuiEmprestimo;
    }
}

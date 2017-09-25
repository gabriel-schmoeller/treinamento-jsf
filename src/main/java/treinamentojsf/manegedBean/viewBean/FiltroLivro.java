package treinamentojsf.manegedBean.viewBean;

import java.util.Date;

public class FiltroLivro {
    private String nomGenRes;
    private Date publicadoAntesDe;
    private Date publicadoDepoisDe;
    private Boolean emprestado; // "Sim", "Não", "Ambos"
    private Date emprestadoAntesDe;
    private Date emprestadoDepoisDe;

    public FiltroLivro() {
        this.nomGenRes = "";
    }

    public FiltroLivro(String nomGenRes, Date publicadoAntesDe, Date publicadoDepoisDe, Boolean emprestado, Date emprestadoAntesDe, Date emprestadoDepoisDe) {
        this.nomGenRes = nomGenRes;
        this.publicadoAntesDe = publicadoAntesDe;
        this.publicadoDepoisDe = publicadoDepoisDe;
        this.emprestado = emprestado;
        this.emprestadoAntesDe = emprestadoAntesDe;
        this.emprestadoDepoisDe = emprestadoDepoisDe;
    }

    public String getNomGenRes() {
        return nomGenRes;
    }

    public void setNomGenRes(String nomGenRes) {
        this.nomGenRes = nomGenRes;
    }

    public Date getPublicadoAntesDe() {
        return publicadoAntesDe;
    }

    public void setPublicadoAntesDe(Date publicadoAntesDe) {
        this.publicadoAntesDe = publicadoAntesDe;
    }

    public Date getPublicadoDepoisDe() {
        return publicadoDepoisDe;
    }

    public void setPublicadoDepoisDe(Date publicadoDepoisDe) {
        this.publicadoDepoisDe = publicadoDepoisDe;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Date getEmprestadoAntesDe() {
        return emprestadoAntesDe;
    }

    public void setEmprestadoAntesDe(Date emprestadoAntesDe) {
        this.emprestadoAntesDe = emprestadoAntesDe;
    }

    public Date getEmprestadoDepoisDe() {
        return emprestadoDepoisDe;
    }

    public void setEmprestadoDepoisDe(Date emprestadoDepoisDe) {
        this.emprestadoDepoisDe = emprestadoDepoisDe;
    }
}

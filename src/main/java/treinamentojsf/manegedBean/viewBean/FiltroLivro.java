package treinamentojsf.manegedBean.viewBean;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean(name = "filtroLivro")
public class FiltroLivro {
    private String genNomRes;
    private Date publicadoAntesDe;
    private Date publicadoDepoisDe;
    private String emprestado; // "Sim", "Não", "Ambos"
    private Date emprestadoAntesDe;
    private Date emprestadoDepoisDe;

    public FiltroLivro() {
    }

    public FiltroLivro(String genNomRes, Date publicadoAntesDe, Date publicadoDepoisDe, String emprestado, Date emprestadoAntesDe, Date emprestadoDepoisDe) {
        this.genNomRes = genNomRes;
        this.publicadoAntesDe = publicadoAntesDe;
        this.publicadoDepoisDe = publicadoDepoisDe;
        this.emprestado = emprestado;
        this.emprestadoAntesDe = emprestadoAntesDe;
        this.emprestadoDepoisDe = emprestadoDepoisDe;
    }

    public String getGenNomRes() {
        return genNomRes;
    }

    public Date getPublicadoAntesDe() {
        return publicadoAntesDe;
    }

    public Date getPublicadoDepoisDe() {
        return publicadoDepoisDe;
    }

    public String getEmprestado() {
        return emprestado;
    }

    public Date getEmprestadoAntesDe() {
        return emprestadoAntesDe;
    }

    public Date getEmprestadoDepoisDe() {
        return emprestadoDepoisDe;
    }
}

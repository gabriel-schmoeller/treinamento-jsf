package treinamentojsf.entity;

import java.util.Date;

/**
 * Created by Lais Lodi on 28/08/2017.
 */
public class Emprestimos {
    private int id;
    private int idLivro;
    private Date dataEmprestimo;

    public Emprestimos(int id, int idLivro, Date dataEmprestimo) {
        this.id = id;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getidLivro() {
        return idLivro;
    }
    public void setidLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }


}

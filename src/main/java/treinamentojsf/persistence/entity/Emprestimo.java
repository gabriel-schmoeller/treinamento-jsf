package treinamentojsf.persistence.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by Lais Lodi on 28/08/2017.
 */
@Entity
@Table(name = "EMPRESTIMOS")
public class Emprestimo {
    @Id
    @SequenceGenerator(name="seq_emprestimos", sequenceName="seq_id_emprestimos", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_emprestimos")
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
    @Column(name = "LIVROS_ID", nullable = false)
    private Integer livrosId;
    @Column(name = "CLIENTES_ID", nullable = false)
    private Integer clientesId;
    @Column(name = "DATA_EMPRESTIMO", nullable = false)
    private Date dataEmprestimo;

    public Emprestimo(){}

    public Emprestimo(Integer id, Integer livrosId, Integer clientesId, Date dataEmprestimo) {
        this.id = id;
        this.livrosId = livrosId;
        this.clientesId = clientesId;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLivrosId() {
        return livrosId;
    }

    public void setLivrosId(Integer livrosId) {
        this.livrosId = livrosId;
    }

    public Integer getClientesId() {
        return clientesId;
    }

    public void setClientesId(int clientesId) {
        this.clientesId = clientesId;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }



}

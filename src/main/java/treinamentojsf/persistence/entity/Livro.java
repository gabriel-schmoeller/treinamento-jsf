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
@Table(name = "LIVROS")
public class Livro {

    @Id
    @SequenceGenerator(name="seq_livros", sequenceName="seq_id_livros", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_livros")
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "GENERO", nullable = false)
    private String genero;
    @Column(name = "RESUMO", nullable = false)
    private String resumo;
    @Column(name = "DATA_PUBLICACAO", nullable = false)
    private Date dataPublicacao;

    public Livro() {
    }

    public Livro(Integer id, String nome, String genero, String resumo, Date dataPublicacao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.resumo = resumo;
        this.dataPublicacao = dataPublicacao;
    }


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "nome: '" + nome + '\'' +
                ", genero: '" + genero + '\'' +
                ", resumo: '" + resumo + '\'' +
                ", data de publicacao: '" + dataPublicacao + '\'';
    }
}

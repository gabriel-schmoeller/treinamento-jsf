package treinamentojsf.persistence.entity;

import javax.persistence.*;

/**
 * Created by Lais Lodi on 28/08/2017.
 */
@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id
    @SequenceGenerator(name="seq_clientes", sequenceName="seq_id_clientes", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_clientes")
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "CPF", nullable = false)
    private String cpf;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONE", nullable = false)
    private String telefone;
    @OneToOne(mappedBy = "cliente")
    private Emprestimo emprestimo;

    public Cliente(){}

    public Cliente(Integer id, String nome, String cpf, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
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

    @Override
    public String toString() {
        return "Cliente: " +
                "nome: '" + nome + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", email: '" + email + '\'';
    }

}

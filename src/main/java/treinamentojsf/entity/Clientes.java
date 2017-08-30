package treinamentojsf.entity;

/**
 * Created by Lais Lodi on 28/08/2017.
 */
public class Clientes {
    private static int id;
    private String nome;
    private String cpf;
    private String email;

    public Clientes(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Clientes.id = id;
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

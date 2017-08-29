/**
 * Created by Lais Lodi on 28/08/2017.
 */
public class Clients {
    private static int id;
    private String name;
    private String cpf;
    private String email;

    public Clients(int id, String name, String cpf, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Clients.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
                "nome: '" + name + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", email: '" + email + '\'';
    }

}

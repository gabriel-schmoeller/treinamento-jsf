package treinamentojsf.manegedBean;

import org.hibernate.Session;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;
import treinamentojsf.persistence.entity.Emprestimo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "dtlCliente")
public class DetalharCliente {

    private Cliente cliente = new Cliente();
    private Emprestimo emprestimo = new Emprestimo();

    public Cliente detalharCliente(Cliente cliente){
        if (cliente != null){
            Session session = SessionFactoryHolder.openSession();
            String where = " where c.id = " + cliente.getId();
            session.createQuery("select c from Cliente c " + where, Cliente.class);


        }
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}

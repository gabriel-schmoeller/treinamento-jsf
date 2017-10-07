package treinamentojsf.manegedBean;

import org.hibernate.Session;
import org.hibernate.query.Query;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;
import treinamentojsf.persistence.entity.Emprestimo;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "dtlCliente")
public class DetalharCliente {

    private Cliente cliente;

    public DetalharCliente(){
        Session session = SessionFactoryHolder.getSessionFactory().openSession();

        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String parameter = req.getParameter("id");
        Integer id = Integer.valueOf(parameter);

        Query<Cliente> query = session.createQuery("SELECT c FROM Cliente c WHERE c.id = :id", Cliente.class);
        query.setParameter("id", id);

        this.cliente = query.getSingleResult();
        cliente.getEmprestimos();

        session.close();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

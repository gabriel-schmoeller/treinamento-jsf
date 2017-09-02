package treinamentojsf.manegedBeans;

import org.hibernate.Session;
import org.hibernate.query.Query;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "psqCli")
public class PesquisarCliente {

    public List<Cliente> listarClientes() {
        Session session = SessionFactoryHolder.getSessionFactory().openSession();
        Query<Cliente> query = session.createQuery("select c from Cliente as c", Cliente.class);
        //Query<Cliente> query = session.createQuery("from Cliente", Cliente.class);
        return query.list();
    }
}

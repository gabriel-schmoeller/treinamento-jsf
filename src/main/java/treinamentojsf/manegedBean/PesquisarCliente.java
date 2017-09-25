package treinamentojsf.manegedBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import treinamentojsf.manegedBean.viewBean.FiltroCliente;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;

import java.io.UncheckedIOException;
import java.util.List;
import java.util.function.Consumer;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "psqCli")
public class PesquisarCliente {

    private FiltroCliente filtro;

    public FiltroCliente getFiltro() {
        return filtro;
    }

    public List<Cliente> listar(){
    //SessionFactory sessionFactory = SessionFactoryHolder.getSessionFactory();
        Session session = SessionFactoryHolder.openSession();

        Query<Cliente> query = session.createQuery("select c from Cliente c", Cliente.class);
        List<Cliente> list = query.list();
        session.close();
        return list;
    }

    public List<Cliente> listarComFiltro(){
        Session session = SessionFactoryHolder.openSession();
        String where = "";

        if (filtro != null) {
            where = " nome like '%" + filtro.getNome() + "%' and " +
                    " cpf like '%" + filtro.getCpf() + "%' and " +
                    " email like '%" + filtro.getEmail() + "%' and " +
                    " telefone like '%" + filtro.getTelefone() + "%'";

        }
        Query<Cliente> query = session.createQuery("select c from Cliente c " + where, Cliente.class);
        return query.list();
    }
}

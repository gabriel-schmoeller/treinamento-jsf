package treinamentojsf.manegedBeans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Livro;

import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * @author Gabriel.Schmoeller
 */
@ManagedBean(name = "psqLiv")
public class PesquisarLivro {

    public List<Livro> listar(){
        SessionFactory sessionFactory = SessionFactoryHolder.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Livro> query = session.createQuery("select l from Livro l", Livro.class);
        return query.list();
    }
}

package treinamentojsf.manegedBeans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Livro;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author Gabriel.Schmoeller
 */
@ManagedBean(name = "cadLiv")
public class CadastrarLivro {

    private Livro livro = new Livro();

    public Livro getLivro() {
        return livro;
    }

    public void salvar(){
        SessionFactory sessionFactory = SessionFactoryHolder.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(livro);
        transaction.commit();
        session.close();

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Informação armazenada com Sucesso!"));
    }
}

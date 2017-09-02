package treinamentojsf.manegedBeans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author Gabriel.Schmoeller
 */
@ManagedBean(name = "cadCli")
public class CadastrarCliente {
    private Cliente cliente = new Cliente();

    public Cliente getCliente() {
        return cliente;
    }

    public void salvar(){

        SessionFactory sessionFactory = SessionFactoryHolder.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(cliente);
        transaction.commit();
        session.close();

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Informação armazenada com Sucesso!"));
    }

}
package treinamentojsf.manegedBean;

import org.hibernate.Session;
import org.hibernate.query.Query;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Livro;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ManagedBean(name = "dtlLivro")
public class DetalharLivro {

    private Livro livro;

    public DetalharLivro() {
        Session session = SessionFactoryHolder.getSessionFactory().openSession();

//        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        Integer id = Integer.valueOf(req.getParameter("id"));
//        equivale a linha de baixo
        Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer id = Integer.valueOf(params.get("id"));

        Query<Livro> query = session.createQuery("SELECT l FROM Livro l WHERE l.id = :id", Livro.class);
        query.setParameter("id", id);

        this.livro = query.getSingleResult();

        session.close();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}

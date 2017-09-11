package treinamentojsf.manegedBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import treinamentojsf.manegedBean.viewBean.FiltroLivro;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Livro;

import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * @author Gabriel.Schmoeller
 */
@ManagedBean(name = "psqLiv")
public class PesquisarLivro {

    private FiltroLivro filtro;

    public List<Livro> listar(){
        Session session = SessionFactoryHolder.openSession();

        Query<Livro> query = session.createQuery("select l from Livro l", Livro.class);
        List<Livro> list = query.list();
        session.close();
        return list;
    }

    public List<Livro> listarComFiltro(FiltroLivro filtro){
        Session session = SessionFactoryHolder.openSession();
        String where = "";

        if (filtro != null) {
            where = " (nome like %" + filtro.getGenNomRes() + "% or " +
                    " genero like %" + filtro.getGenNomRes() + "% or " +
                    " resumo like %" + filtro.getGenNomRes() + "%) and (" +
                    " dataPublicacao < " + filtro.getPublicadoAntesDe() + " and " +
                    " dataPublicacao > " + filtro.getPublicadoDepoisDe() + ")";

        }
        Query<Livro> query = session.createQuery("select l from Livro " + where, Livro.class);
        return query.list();
    }
}

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

    private FiltroLivro filtro = new FiltroLivro();

    public FiltroLivro getFiltro() {
        return filtro;
    }

    public List<Livro> listar(){
        Session session = SessionFactoryHolder.openSession();

        Query<Livro> query = session.createQuery("select l from Livro l", Livro.class);
        List<Livro> list = query.list();
        session.close();
        return list;
    }

    public List<Livro> listarComFiltro(){
        Session session = SessionFactoryHolder.openSession();
        String where = " where 1 = 1 ";


        if (!filtro.getNomGenRes().equals("")){
            where += " (and nome like %" + filtro.getNomGenRes() + "% or " +
                    " genero like %" + filtro.getNomGenRes() + "% or " +
                    " resumo like %" + filtro.getNomGenRes() + "%) ";
        }

        if (filtro.getEmprestadoAntesDe() != null){
            where += " and dataPublicacao < " + filtro.getPublicadoAntesDe();
        }

        if (filtro.getEmprestadoDepoisDe() != null){
            where += " and dataPublicacao < " + filtro.getPublicadoDepoisDe();
        }

        if (filtro.getEmprestado() != null){
            if(filtro.getEmprestado()){
                where += " and  EMPRESTIMOS.ID IS NULL ";
            }else{
                where += " and  EMPRESTIMOS.ID IS NOT NULL ";
            }
        }

        Query<Livro> query = session.createQuery("select l from Livro l left join l.emprestimo e " + where, Livro.class);
        return query.list();
    }
}

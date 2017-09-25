package treinamentojsf.manegedBean;

import org.hibernate.Session;
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

    public List<Livro> listarComFiltro(){
        Session session = SessionFactoryHolder.openSession();
        String where = " where 1 = 1 ";


        if (!filtro.getNomGenRes().equals("")){
            where += " and (nome like :nomGenRes or " +
                    " genero like :nomGenRes or " +
                    " resumo like :nomGenRes) ";
        }

        if (filtro.getPublicadoAntesDe() != null){
            where += " and dataPublicacao < :publicadoAntesDe ";
        }

        if (filtro.getPublicadoDepoisDe() != null){
            where += " and dataPublicacao < :publicadoDepoisDe ";
        }

        if (filtro.getEmprestado() != null){
            if(filtro.getEmprestado()){
                where += " and  e.id IS NOT NULL ";
            }else{
                where += " and  e.id IS NULL ";
            }
        }

        if (filtro.getEmprestadoAntesDe() != null){
            where += " and e.dataEmprestimo < :emprestadoAntesDe ";
        }

        if (filtro.getEmprestadoDepoisDe() != null){
            where += " and e.dataEmprestimo > :emprestadoDepoisDe ";
        }

        Query<Livro> query = session.createQuery("select l from Livro l left join l.emprestimo e " + where, Livro.class);
        if (!filtro.getNomGenRes().equals("")) {
            query.setParameter("nomGenRes", filtro.getNomGenRes());
        }
        if (filtro.getPublicadoAntesDe() != null) {
            query.setParameter("publicadoAntesDe", filtro.getPublicadoAntesDe());
        }
        if (filtro.getPublicadoDepoisDe() != null){
            query.setParameter("publicadoDepoisDe", filtro.getPublicadoDepoisDe());
        }
        if (filtro.getEmprestadoAntesDe() != null) {
            query.setParameter("emprestadoAntesDe", filtro.getPublicadoAntesDe());
        }
        if (filtro.getEmprestadoDepoisDe() != null){
            query.setParameter("emprestadoDepoisDe", filtro.getPublicadoDepoisDe());
        }

        return query.list();
    }
}

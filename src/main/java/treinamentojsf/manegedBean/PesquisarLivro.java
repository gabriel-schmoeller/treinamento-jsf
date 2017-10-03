package treinamentojsf.manegedBean;

import org.hibernate.Session;
import org.hibernate.query.Query;
import treinamentojsf.manegedBean.viewBean.FiltroLivro;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;
import treinamentojsf.persistence.entity.Livro;

import javax.faces.bean.ManagedBean;
import java.util.List;


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
        List<Livro> list;

       if (!filtro.getNomGenRes().equals("")){
            where += " and (l.nome like :nomGenRes or " +
                    " l.genero like :nomGenRes or " +
                    " l.resumo like :nomGenRes) ";
        }

        if (filtro.getEmprestadoAntesDe() != null){
            where += " and e.dataEmprestimo < :emprestadoAntesDe";
        }

        if (filtro.getEmprestadoDepoisDe() != null){
            where += " and e.dataEmprestimo > :emprestadoDepoisDe ";
        }

        if (filtro.getPublicadoDepoisDe() != null){
            where += " and l.dataPublicacao > :publicadoDepoisDe ";
        }

        if (filtro.getPublicadoAntesDe() != null){
            where += " and l.dataPublicacao < :publicadoAntesDe ";
        }

        if (filtro.getEmprestado() != null){
            if(!filtro.getEmprestado()){
                where += " and  e.id IS NULL ";
            }else{
                where += " and  e.id IS NOT NULL ";
            }
        }

        String hql = "select l from Livro l left join l.emprestimo e ";
        Query<Livro> query = session.createQuery(hql + where, Livro.class);
        if (!filtro.getNomGenRes().equals("")){
            query.setParameter("nomGenRes", "%" + filtro.getNomGenRes() + "%");
        }
        if (filtro.getEmprestadoAntesDe() != null){
            query.setParameter("emprestadoAntesDe", filtro.getEmprestadoAntesDe());
        }
        if (filtro.getEmprestadoDepoisDe() != null){
            query.setParameter("emprestadoDepoisDe", filtro.getEmprestadoDepoisDe());
        }
        if (filtro.getPublicadoDepoisDe() != null){
            query.setParameter("publicadoDepoisDe", filtro.getPublicadoDepoisDe());
        }
        if (filtro.getPublicadoAntesDe() != null){
            query.setParameter("publicadoAntesDe", filtro.getPublicadoAntesDe());
        }
        list = query.list();


        session.close();
        return list;
    }
}

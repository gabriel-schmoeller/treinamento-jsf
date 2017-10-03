package treinamentojsf.manegedBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import treinamentojsf.manegedBean.viewBean.FiltroCliente;
import treinamentojsf.persistence.SessionFactoryHolder;
import treinamentojsf.persistence.entity.Cliente;

import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "psqCli")
public class PesquisarCliente {

    private FiltroCliente filtro = new FiltroCliente();

    public FiltroCliente getFiltro() {
        return filtro;
    }

    public List<Cliente> listarComFiltro(){
        Session session = SessionFactoryHolder.openSession();
        String where = " where 1 = 1 ";
        List<Cliente> list;

        if (!filtro.getNomeEmail().equals("")){
            where += " and (c.nome like :nomeEmail or c.email like :nomeEmail) ";
        }

        if (filtro.getPossuiEmprestimo() != null){
            if(!filtro.getPossuiEmprestimo()){
                where += " and  e.id IS NULL ";
            }else{
                where += " and  e.id IS NOT NULL ";
            }
        }

        String hql = "select c from Cliente c left join c.emprestimo e ";
        Query<Cliente> query = session.createQuery(hql + where, Cliente.class);
        if (!filtro.getNomeEmail().equals("")){
            query.setParameter("nomeEmail", "%" + filtro.getNomeEmail() + "%");
        }
        list = query.list();

        session.close();
        return list;
    }
}

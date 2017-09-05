package treinamentojsf.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author Gabriel.Schmoeller
 */
public class SessionFactoryHolder {

    private static final SessionFactory sessionFactory = criarSessao();

    private static SessionFactory criarSessao(){
        final StandardServiceRegistry registry;
        try{
            registry = new StandardServiceRegistryBuilder()
                    .configure() // configures settings from hibernate.cfg.xml
                    .build();

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
        return new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session openSession(){
        SessionFactory sessionFactory = SessionFactoryHolder.getSessionFactory();
        return sessionFactory.openSession();
    }

    public static void closeSession(Session session){
        session.close();
    }
}

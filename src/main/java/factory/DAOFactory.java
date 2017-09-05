package factory;

import com.gc.spring.DAO.Dao;
import com.gc.spring.DAO.HibernateDao;

public class DAOFactory {

    public static final int HIBERNATE = 1;


    public static Dao getInstance (int daoType){

        Dao dao = null;

        switch (daoType){
            case HIBERNATE:
                dao = new HibernateDao();
                break;
           default:
               break;
        }

        return dao;
    }
}

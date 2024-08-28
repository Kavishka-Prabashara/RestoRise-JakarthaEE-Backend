package lk.kavishka.restorisejakarthaeebackend.dao;

import lk.kavishka.restorisejakarthaeebackend.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getDAOFactory(){
        return (daoFactory == null)?daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes{
        CUSTOMER,iTEM,ORDER,ORDER_DETAIL,STAFF
    }

    public SuperDAO DAOTypes(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case iTEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDAOImpl();
            case ORDER_DETAIL:
                return new OrderDetailDAOImpl();
            case STAFF:
                return new StaffDAOImpl();
            default:
                return null;
        }
    }
}

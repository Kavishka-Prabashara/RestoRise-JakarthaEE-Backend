package lk.kavishka.restorisejakarthaeebackend.bo;

import lk.kavishka.restorisejakarthaeebackend.bo.custom.impl.CustomerBOImpl;
import lk.kavishka.restorisejakarthaeebackend.bo.custom.impl.ItemBOImpl;
import lk.kavishka.restorisejakarthaeebackend.bo.custom.impl.OrderBOImpl;
import lk.kavishka.restorisejakarthaeebackend.bo.custom.impl.OrderDetailBOImpl;
import lk.kavishka.restorisejakarthaeebackend.bo.custom.impl.StaffBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getBOFactory(){
        return (boFactory == null)?boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        CUSTOMERS,ITEMS,STAFFS,ORDERS,OrderDETAILS
    }

    public SuperBO BOTypes(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMERS:
                return new CustomerBOImpl();
            case ITEMS:
                return new ItemBOImpl();
            case STAFFS:
                return new StaffBOImpl();
            case ORDERS:
                return new OrderBOImpl();
            case OrderDETAILS:
                return new OrderDetailBOImpl();
                default:
                return null;
        }
    }
}

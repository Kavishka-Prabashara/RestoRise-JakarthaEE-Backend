package lk.kavishka.restorisejakarthaeebackend.bo.custom;

import lk.kavishka.restorisejakarthaeebackend.bo.SuperBO;
import lk.kavishka.restorisejakarthaeebackend.dto.OrderDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderBO extends SuperBO {
    boolean saveOrder(OrderDTO orderDTO , Connection connection) throws SQLException;
    List<OrderDTO> getAllOrder(Connection connection) throws SQLException;
    boolean updateOrder(OrderDTO orderDTO, Connection connection) throws SQLException;
    boolean deleteOrder(String orderID, Connection connection) throws SQLException;
}

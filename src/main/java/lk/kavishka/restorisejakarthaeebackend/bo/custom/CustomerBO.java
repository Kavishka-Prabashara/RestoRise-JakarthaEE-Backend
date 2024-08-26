package lk.kavishka.restorisejakarthaeebackend.bo.custom;

import lk.kavishka.restorisejakarthaeebackend.bo.SuperBO;
import lk.kavishka.restorisejakarthaeebackend.dto.CustomerDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface CustomerBO extends SuperBO {
    List<CustomerDTO> getAllCustomer(Connection connection) throws SQLException;
    boolean updateCustomer(CustomerDTO customerDTO,Connection connection) throws SQLException;
    boolean saveCustomer(CustomerDTO customerDTO , Connection connection) throws SQLException;
    boolean deleteCustomer(String id,Connection connection) throws SQLException;
}

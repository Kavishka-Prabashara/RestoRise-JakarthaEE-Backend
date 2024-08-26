package lk.kavishka.restorisejakarthaeebackend.bo.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.bo.custom.CustomerBO;
import lk.kavishka.restorisejakarthaeebackend.dto.CustomerDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerBOImpl implements CustomerBO {

    @Override
    public List<CustomerDTO> getAllCustomer(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id, Connection connection) throws SQLException {
        return false;
    }
}

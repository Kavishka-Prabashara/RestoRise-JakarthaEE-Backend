package lk.kavishka.restorisejakarthaeebackend.dao.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.dao.custom.CustomerDAO;
import lk.kavishka.restorisejakarthaeebackend.entity.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean save(Customer dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public List<Customer> getAll(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean update(Customer dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id, Connection connection) throws SQLException {
        return false;
    }
}

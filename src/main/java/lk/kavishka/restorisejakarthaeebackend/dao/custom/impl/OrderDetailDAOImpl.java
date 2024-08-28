package lk.kavishka.restorisejakarthaeebackend.dao.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.dao.custom.OrderDetailDAO;
import lk.kavishka.restorisejakarthaeebackend.entity.OrderDetails;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailDAOImpl implements OrderDetailDAO{
    @Override
    public boolean save(OrderDetails dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public List<OrderDetails> getAll(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean update(OrderDetails dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id, Connection connection) throws SQLException {
        return false;
    }
}

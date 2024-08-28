package lk.kavishka.restorisejakarthaeebackend.dao.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.dao.custom.OrderDAO;
import lk.kavishka.restorisejakarthaeebackend.entity.Order;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public boolean save(Order dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public List<Order> getAll(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean update(Order dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id, Connection connection) throws SQLException {
        return false;
    }
}

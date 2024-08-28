package lk.kavishka.restorisejakarthaeebackend.dao.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.dao.custom.ItemDAO;
import lk.kavishka.restorisejakarthaeebackend.entity.Item;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean save(Item dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public List<Item> getAll(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean update(Item dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id, Connection connection) throws SQLException {
        return false;
    }
}

package lk.kavishka.restorisejakarthaeebackend.dao.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.dao.custom.StaffDAO;
import lk.kavishka.restorisejakarthaeebackend.entity.Staff;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StaffDAOImpl implements StaffDAO{
    @Override
    public boolean save(Staff dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public List<Staff> getAll(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean update(Staff dto, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id, Connection connection) throws SQLException {
        return false;
    }
}

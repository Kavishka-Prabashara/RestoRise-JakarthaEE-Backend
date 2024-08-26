package lk.kavishka.restorisejakarthaeebackend.bo.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.bo.custom.StaffBO;
import lk.kavishka.restorisejakarthaeebackend.dto.StaffDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StaffBOImpl implements StaffBO{
    @Override
    public boolean saveStaff(StaffDTO staffDTO, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public List<StaffDTO> getAllStaff(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean updateStaff(StaffDTO staffDTO, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteStaff(String staffID, Connection connection) throws SQLException {
        return false;
    }
}

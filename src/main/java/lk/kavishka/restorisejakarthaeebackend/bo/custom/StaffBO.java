package lk.kavishka.restorisejakarthaeebackend.bo.custom;

import lk.kavishka.restorisejakarthaeebackend.bo.SuperBO;
import lk.kavishka.restorisejakarthaeebackend.dto.StaffDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface StaffBO extends SuperBO {
    boolean saveStaff(StaffDTO staffDTO , Connection connection) throws SQLException;
    List<StaffDTO> getAllStaff(Connection connection) throws SQLException;
    boolean updateStaff(StaffDTO staffDTO, Connection connection) throws SQLException;
    boolean deleteStaff(String staffID, Connection connection) throws SQLException;
}

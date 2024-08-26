package lk.kavishka.restorisejakarthaeebackend.bo.custom;

import lk.kavishka.restorisejakarthaeebackend.bo.SuperBO;
import lk.kavishka.restorisejakarthaeebackend.dto.ItemDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ItemBO extends SuperBO {
    List<ItemDTO> getAllItem(Connection connection) throws SQLException;
    boolean updateItem(ItemDTO itemDTO,Connection connection) throws SQLException;
    boolean saveItem(ItemDTO itemDTO , Connection connection) throws SQLException;
    boolean deleteItem(String id,Connection connection) throws SQLException;
}

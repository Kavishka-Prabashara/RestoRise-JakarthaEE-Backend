package lk.kavishka.restorisejakarthaeebackend.bo.custom.impl;

import lk.kavishka.restorisejakarthaeebackend.bo.custom.ItemBO;
import lk.kavishka.restorisejakarthaeebackend.dto.ItemDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ItemBOImpl implements ItemBO {

    @Override
    public List<ItemDTO> getAllItem(Connection connection) throws SQLException {
        return List.of();
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean saveItem(ItemDTO itemDTO, Connection connection) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteItem(String id, Connection connection) throws SQLException {
        return false;
    }
}

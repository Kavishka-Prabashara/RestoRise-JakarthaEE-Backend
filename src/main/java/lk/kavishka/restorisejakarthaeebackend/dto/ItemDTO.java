package lk.kavishka.restorisejakarthaeebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO implements Serializable {
    private String supplierId;
    private String supplierName;
    private String dropdownItemCategory;
    private String itemId;
    private String itemName;
    private String itemitemQTY;
    private String itemUnititemUnitPrice;
    private String suppliedDate;
}

package lk.kavishka.restorisejakarthaeebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String supplierId;
    private String supplierName;
    private String dropdownItemCategory;
    private String itemId;
    private String itemName;
    private String itemitemQTY;
    private String itemUnititemUnitPrice;
    private String suppliedDate;
}

package lk.kavishka.restorisejakarthaeebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String customerIdCB;
    private LocalDate itemIdCB;
    private String orderId;
    private double itemName;
    private double itemUnititemUnitPrice;
    private double qtyOnHand;
    private double itemitemQTY;
    private double customerName;
    private double total;
    private double discountInput;
    private double subTotalInput;
    private double cashInput;
    private double balanceInput;
}

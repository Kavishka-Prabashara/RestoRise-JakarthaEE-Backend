package lk.kavishka.restorisejakarthaeebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDTO implements Serializable {
    private String order_id;
    private String order_date;
    private String customerID;
    private String total;
    private String discount;
    private String cash;
}

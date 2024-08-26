package lk.kavishka.restorisejakarthaeebackend.bo.custom.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailBOImpl {
    private String order_id;
    private LocalDate order_date;
    private String customerID;
    private String total;
    private String discount;
    private String cash;
}

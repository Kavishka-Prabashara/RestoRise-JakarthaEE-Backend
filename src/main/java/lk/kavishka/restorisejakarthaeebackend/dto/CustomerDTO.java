package lk.kavishka.restorisejakarthaeebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO implements Serializable {
    private String customerId;
    private String customerName;
    private String customerNIC;
    private String customerContactNo;
}

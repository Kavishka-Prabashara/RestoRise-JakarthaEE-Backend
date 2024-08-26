package lk.kavishka.restorisejakarthaeebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO implements Serializable {
    private String staffId;
    private String staffName;
    private String staffNIC;
    private String staffDob;
    private String jobCategory;
    private String staffContactNo;
}

package lk.kavishka.restorisejakarthaeebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private String staffId;
    private String staffName;
    private String staffNIC;
    private String staffDob;
    private String jobCategory;
    private String staffContactNo;
}

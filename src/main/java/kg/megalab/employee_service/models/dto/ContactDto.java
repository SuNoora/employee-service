package kg.megalab.employee_service.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ContactDto {

    Long id;
    @NotBlank
    @Size(min = 9)
    String phoneNumber;
    @Email
    String email;
}

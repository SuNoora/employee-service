package kg.megalab.employee_service.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressDto {

    Long addressId;
    @NotBlank
    String city;
    @NotBlank
    String street;
    @Positive
    int house;
    @PositiveOrZero
    int flat;
}

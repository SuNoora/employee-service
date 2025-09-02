package kg.megalab.employee_service.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeCreateDto {
    @NotBlank(message = "Имя не может быть пустым!")
    String firstName;
    @NotBlank(message = "Фамилия не может быть пустой!")
    String lastName;
    @JsonFormat(pattern = "dd.MM.yyyy")
    @Past
    LocalDate dateOfBirth;

    @Valid
    AccountDto account;

    @Valid
    AddressDto address;
    List<ContactDto> contacts;
}

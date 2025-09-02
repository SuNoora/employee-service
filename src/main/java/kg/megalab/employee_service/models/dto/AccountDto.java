package kg.megalab.employee_service.models.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import kg.megalab.employee_service.models.enums.AccountStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDto {
    Long accountId;
    @NotBlank(message = "Имя польвоателя не может быть пустым!")
    @Size(min = 5, message = "Имя пользователя должно состоять минимум из 5 символов!")
    String login;
    @NotBlank(message = "Пароль не может быть пустым!")
    @Size(min = 10, message = "Пароль должен состоять минимум из 10 символов!")
    String password;
    AccountStatus status;
}

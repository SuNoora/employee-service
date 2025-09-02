package kg.megalab.employee_service.services;

import jakarta.validation.Valid;
import kg.megalab.employee_service.models.Account;
import kg.megalab.employee_service.models.dto.AccountDto;

public interface AccountService {
    Account createAccount(@Valid AccountDto account);
}

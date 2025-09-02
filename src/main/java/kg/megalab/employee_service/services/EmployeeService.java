package kg.megalab.employee_service.services;

import jakarta.validation.Valid;
import kg.megalab.employee_service.models.dto.EmployeeCreateDto;

public interface EmployeeService {
    Long appendEmployee(@Valid EmployeeCreateDto employeeCreateDto);
}

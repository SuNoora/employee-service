package kg.megalab.employee_service.services;

import jakarta.validation.Valid;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.ContactDto;

import java.util.List;

public interface ContactService {
    void saveContacts(@Valid List<ContactDto> contacts, Employee employee);
}

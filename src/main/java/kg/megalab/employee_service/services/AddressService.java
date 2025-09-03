package kg.megalab.employee_service.services;

import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.AddressDto;

public interface AddressService {
    void save(AddressDto addressDto, Employee employee);
}

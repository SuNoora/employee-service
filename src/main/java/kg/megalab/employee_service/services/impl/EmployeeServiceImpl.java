package kg.megalab.employee_service.services.impl;

import jakarta.validation.Valid;
import kg.megalab.employee_service.mappers.AccountMapper;
import kg.megalab.employee_service.mappers.EmployeeMapper;
import kg.megalab.employee_service.models.Account;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.AccountDto;
import kg.megalab.employee_service.models.dto.EmployeeCreateDto;
import kg.megalab.employee_service.repo.EmployeeRepo;
import kg.megalab.employee_service.services.AccountService;
import kg.megalab.employee_service.services.AddressService;
import kg.megalab.employee_service.services.ContactService;
import kg.megalab.employee_service.services.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final AddressService addressService;
    private final ContactService contactService;
    private final AccountService accountService;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo, AddressService addressService, ContactService contactService, AccountService accountService, EmployeeMapper employeeMapper) {
        this.employeeRepo = employeeRepo;
        this.addressService = addressService;
        this.contactService = contactService;
        this.accountService = accountService;
        this.employeeMapper = employeeMapper;
    }


    @Override
    public Long appendEmployee(EmployeeCreateDto employeeCreateDto) {

        Account account1 = AccountMapper.INSTANCE.accountDtoToAccount(employeeCreateDto.getAccount());

        Employee employee = employeeMapper.employeeCreateDtoToEmployee(employeeCreateDto, account1);
        employee = employeeRepo.save(employee);

        return employee.getId();
    }

}

package kg.megalab.employee_service.mappers;

import kg.megalab.employee_service.models.Account;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.EmployeeCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    @Mapping(source = "account", target = "account")
    Employee employeeCreateDtoToEmployee(EmployeeCreateDto employeeCreateDto, Account account);
}

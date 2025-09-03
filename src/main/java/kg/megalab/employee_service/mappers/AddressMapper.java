package kg.megalab.employee_service.mappers;

import kg.megalab.employee_service.models.Address;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);


    @Mapping(source = "employee", target = "employee")
    @Mapping(target = "id", ignore = true)
    Address addressDtoToAddress(AddressDto addressDto, Employee employee);
}

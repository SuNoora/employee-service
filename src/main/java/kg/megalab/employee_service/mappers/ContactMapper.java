package kg.megalab.employee_service.mappers;

import kg.megalab.employee_service.models.Contact;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.ContactDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    @Mapping(target = "id", ignore = true)
    Contact contactDtoToContact(ContactDto contactDto);

    List<Contact> contactDtosToContacts(List<ContactDto> contactDtos);
}

package kg.megalab.employee_service.services.impl;

import jakarta.transaction.Transactional;
import kg.megalab.employee_service.mappers.ContactMapper;
import kg.megalab.employee_service.models.Contact;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.ContactDto;
import kg.megalab.employee_service.repo.ContactRepo;
import kg.megalab.employee_service.services.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepo contactRepo;
    private final ContactMapper contactMapper;

    public ContactServiceImpl(ContactRepo contactRepo, ContactMapper contactMapper) {
        this.contactRepo = contactRepo;
        this.contactMapper = contactMapper;
    }


    @Override
    public void saveContacts(List<ContactDto> contactDtos, Employee employee){
        List<Contact> contacts = contactMapper.contactDtosToContacts(contactDtos);
        for(Contact contact:contacts)
            contact.setEmployee(employee);

        contactRepo.saveAll(contacts);
    }
}

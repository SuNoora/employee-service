package kg.megalab.employee_service.services.impl;

import kg.megalab.employee_service.repo.ContactRepo;
import kg.megalab.employee_service.services.ContactService;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepo contactRepo;

    public ContactServiceImpl(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }
}

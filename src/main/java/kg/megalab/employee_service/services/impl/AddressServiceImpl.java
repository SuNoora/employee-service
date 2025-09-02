package kg.megalab.employee_service.services.impl;

import kg.megalab.employee_service.repo.AddressRepo;
import kg.megalab.employee_service.services.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;


    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }
}

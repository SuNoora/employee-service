package kg.megalab.employee_service.services.impl;

import jakarta.transaction.Transactional;
import kg.megalab.employee_service.mappers.AddressMapper;
import kg.megalab.employee_service.models.Address;
import kg.megalab.employee_service.models.Employee;
import kg.megalab.employee_service.models.dto.AddressDto;
import kg.megalab.employee_service.repo.AddressRepo;
import kg.megalab.employee_service.services.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private AddressMapper addressMapper;


    public AddressServiceImpl(AddressRepo addressRepo, AddressMapper addressMapper) {
        this.addressRepo = addressRepo;
        this.addressMapper = addressMapper;
    }


    @Override
    public void save(AddressDto addressDto, Employee employee){
        Address address = addressMapper.addressDtoToAddress(addressDto, employee);
        System.out.println(address);
        addressRepo.save(address);

    }
}

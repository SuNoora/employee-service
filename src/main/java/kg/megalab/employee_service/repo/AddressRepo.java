package kg.megalab.employee_service.repo;

import kg.megalab.employee_service.models.Account;
import kg.megalab.employee_service.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}

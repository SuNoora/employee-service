package kg.megalab.employee_service.mappers;

import kg.megalab.employee_service.models.Account;
import kg.megalab.employee_service.models.dto.AccountDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "accountId", target = "id")
    Account accountDtoToAccount(AccountDto accountDto);

    @InheritInverseConfiguration
    AccountDto accountToAccountDto(Account account);
}

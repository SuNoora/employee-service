package kg.megalab.employee_service.services.impl;

import jakarta.transaction.Transactional;
import kg.megalab.employee_service.mappers.AccountMapper;
import kg.megalab.employee_service.models.Account;
import kg.megalab.employee_service.models.dto.AccountDto;
import kg.megalab.employee_service.repo.AccountRepo;
import kg.megalab.employee_service.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepo accountRepo;
    private final AccountMapper accountMapper;



    public AccountServiceImpl(AccountRepo accountRepo, AccountMapper accountMapper) {
        this.accountRepo = accountRepo;
        this.accountMapper = accountMapper;
    }

    @Override
    public Account createAccount(AccountDto accountDto){
        Account account = accountMapper.accountDtoToAccount(accountDto);
        return accountRepo.save(account);
    }
}

package com.cachingApp.services.impl;

import com.cachingApp.entities.Employee;
import com.cachingApp.entities.SalaryAccount;
import com.cachingApp.repositories.SalaryAccountRepository;
import com.cachingApp.services.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
@RequiredArgsConstructor
public class SalaryServiceImpl implements SalaryService {

    private final SalaryAccountRepository salaryAccountRepository;
    @Override
    public void createAccount(Employee employee) {
        SalaryAccount salaryAccount =
                SalaryAccount.builder()
                        .employee(employee)
                        .balance(BigDecimal.ZERO)
                        .build();
        salaryAccountRepository.save(salaryAccount);
    }
}

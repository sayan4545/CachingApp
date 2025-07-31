package com.cachingApp.repositories;

import com.cachingApp.entities.SalaryAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryAccountRepository extends JpaRepository<SalaryAccount, Long> {
}

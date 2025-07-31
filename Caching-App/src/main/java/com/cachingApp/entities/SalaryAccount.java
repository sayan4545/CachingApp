package com.cachingApp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Builder@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;

    @OneToOne
    private Employee employee;
}

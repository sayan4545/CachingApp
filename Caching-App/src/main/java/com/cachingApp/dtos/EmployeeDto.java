package com.cachingApp.dtos;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto implements Serializable {
    private Long id;
    private String email;
    private String name;
    private Long salary;
}

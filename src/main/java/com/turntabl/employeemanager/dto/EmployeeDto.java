package com.turntabl.employeemanager.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Value
@Builder
public class EmployeeDto {
    Long id;
    String name;
    String email;
    String phone;
    String jobTitle;
    String imageUrl;
    String employeeCode;

}

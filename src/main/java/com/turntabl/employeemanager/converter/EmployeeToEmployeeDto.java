package com.turntabl.employeemanager.converter;
import com.turntabl.employeemanager.dto.EmployeeDto;
import com.turntabl.employeemanager.model.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeToEmployeeDto implements Converter<Employee, EmployeeDto> {


    @Override
    public EmployeeDto convert(Employee source) {
        return  EmployeeDto.builder()
                .employeeCode(source.getEmployeeCode())
                .id(source.getId())
                .email(source.getEmail())
                .jobTitle(source.getJobTitle())
                .phone(source.getPhone())
                .imageUrl(source.getImageUrl())
                .name(source.getName()).build();
    }

}

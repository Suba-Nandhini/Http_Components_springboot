package com.HttpComponent.practice_session.dto;

import com.HttpComponent.practice_session.model.Employee;
import lombok.Data;

@Data
public class ResponseDTO {
    private Employee employee;
    private String eId;
    private String eName;
}

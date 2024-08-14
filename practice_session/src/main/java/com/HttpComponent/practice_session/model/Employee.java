package com.HttpComponent.practice_session.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;

@Document("Employee")
@Data
public class Employee {
    private String e_name;
    @Id
    private String e_id;

}

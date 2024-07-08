package com.arturocode.basicrest.presentation.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private byte age;

}

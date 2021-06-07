package com.fwkily.domain.dto;


import lombok.Data;

import java.io.Serializable;


@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;


}

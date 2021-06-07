package com.fwkily.domain.vo;


import lombok.Data;

import java.io.Serializable;


@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;


}

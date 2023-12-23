package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lidashuang
 * @version 1.0
 */
@Data
@Accessors(chain = true)
@Entity(name = "p6e_config")
public class TestModel implements Serializable {

    @Id
    private Integer id;
    private String key;

}


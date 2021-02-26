package com.andrew.mall.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="AUTO_USER")
@Data
public class User implements Serializable {

    @Id
    private long id;
    @Column(length = 32)
    private String name;
    @Column(length=32)
    private String account;
    @Column(length=64)
    private String pwd;

}

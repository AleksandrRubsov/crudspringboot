package com.ruba.crudspringboot.model;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id //так как id первичный ключ
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоинкремент для id(авто увеличение значения)
    private Long id;

    @Column(name = "first_name") // чтобы Data не искал в CamelCase
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private Long phone_number;
}

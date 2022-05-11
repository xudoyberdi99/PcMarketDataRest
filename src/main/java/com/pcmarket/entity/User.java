package com.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String  lastName;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @OneToOne(optional = false)
    private Attachment attachment;
    @Column(nullable = false)
    private String password;
    @OneToOne(optional = false)
    private Address address;




}

package com.example.admistrator.data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="supportdata")
public class support_data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    
    @Column(name = "email")
    private String email;

    @Column(name = "date")
    private Date date ;

    @Column(name = "Deapartment")
    private String Deapartment;


    @Column(name = "query")
    private String query;







    
}

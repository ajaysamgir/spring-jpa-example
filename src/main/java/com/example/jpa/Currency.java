package com.example.jpa;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Data
@Builder
@Entity
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private int numericCode;

    private String codeStr;

    private String description;
}

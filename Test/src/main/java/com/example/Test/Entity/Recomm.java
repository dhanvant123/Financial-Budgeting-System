package com.example.Test.Entity;

import com.example.Test.Enum.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recommendation")
public class Recomm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rId;

    @Column(length = 100)
    private String recDesc;

    private int recPercent;

    private Category category;
}

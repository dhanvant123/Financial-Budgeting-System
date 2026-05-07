package com.example.Test.Entity;

import com.example.Test.Enum.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recommendation")
public class Recomm {
    @Column(length = 100)
    private String recDesc;

    private int recPercent;

    @ManyToOne
    @JoinColumn(name = "uid")
    private User user;

    private Category category;
}

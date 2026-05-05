package com.example.Test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "grp")
public class Grp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gid;

    private String gname;

    private String desc;
}

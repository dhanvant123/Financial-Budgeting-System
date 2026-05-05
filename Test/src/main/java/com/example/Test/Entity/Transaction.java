package com.example.Test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tid;

    private String accId;

    private String upi;

    @ManyToOne
    @JoinColumn(name = "gid")
    private Grp grp;

    @ManyToOne
    @JoinColumn(name = "wid")
    private Wallet wal;
}

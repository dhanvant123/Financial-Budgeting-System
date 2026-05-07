package com.example.Test.Entity;

import java.time.LocalDateTime;

import com.example.Test.Enum.Status;

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

    private Long amt;

    private String transacType;

    private LocalDateTime timeStamp;

    private Status status;

    @ManyToOne
    @JoinColumn(name = "gid")
    private Grp grp;

    @ManyToOne
    @JoinColumn(name = "uid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "wid")
    private Wallet wal;
}

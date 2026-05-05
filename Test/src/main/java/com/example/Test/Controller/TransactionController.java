package com.example.Test.Controller;

import com.example.Test.Entity.Transaction;
import com.example.Test.Service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService ser;

    public TransactionController(TransactionService ser) {
        this.ser = ser;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return ser.saveTransaction(transaction);
    }

    @GetMapping("/user/{userId}")
    public List<Transaction> getTransactions(@PathVariable Long userId) {
        return ser.getTransactionsByUser(userId);
    }
}
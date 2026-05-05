package com.example.Test.Service;

import com.example.Test.Entity.Transaction;
import com.example.Test.Repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repo;

    public TransactionService(TransactionRepository repo) {
        this.repo = repo;
    }

    public Transaction saveTransaction(Transaction transaction) {
        return repo.save(transaction);
    }

    public List<Transaction> getTransactionsByUser(Long userId) {
        return repo.findByUserId(userId);
    }
}
package com.example.Test.Service;

import com.example.Test.Entity.Wallet;
import com.example.Test.Repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository repo;

    public WalletService(WalletRepository repo) {
        this.repo = repo;
    }

    public Wallet deposit(Long userId, double amount) {
        Wallet wallet = repo.findByUserId(userId);
        wallet.setBalance(wallet.getBalance() + amount);
        return repo.save(wallet);
    }

    public Wallet withdraw(Long userId, double amount) {
        Wallet wallet = repo.findByUserId(userId);
        wallet.setBalance(wallet.getBalance() - amount);
        return repo.save(wallet);
    }

    public Wallet getWalletByUserId(Long userId) {
        return repo.findByUserId(userId);
    }
}
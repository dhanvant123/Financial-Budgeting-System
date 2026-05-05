package com.example.Test.Controller;

import com.example.Test.Entity.Wallet;
import com.example.Test.Service.WalletService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wallets")
public class WalletController {

    private final WalletService ser;

    public WalletController(WalletService ser) {
        this.ser = ser;
    }

    @PostMapping("/deposit/{userId}")
    public Wallet deposit(@PathVariable Long userId,
            @RequestParam double amount) {
        return ser.deposit(userId, amount);
    }

    @PostMapping("/withdraw/{userId}")
    public Wallet withdraw(@PathVariable Long userId,
            @RequestParam double amount) {
        return ser.withdraw(userId, amount);
    }

    @GetMapping("/{userId}")
    public Wallet getWallet(@PathVariable Long userId) {
        return ser.getWalletByUserId(userId);
    }
}
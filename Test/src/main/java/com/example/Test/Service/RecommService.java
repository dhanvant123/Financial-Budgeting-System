package com.example.Test.Service;

import com.example.Test.Entity.Recomm;
import com.example.Test.Repository.RecommRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommService {

    private final RecommRepository repo;

    public RecommService(RecommRepository repo) {
        this.repo = repo;
    }

    public Recomm saveRecomm(Recomm recomm) {
        return repo.save(recomm);
    }

    public List<Recomm> getRecommForUser(Long userId) {
        return repo.findByUserId(userId);
    }
}
package com.example.Test.Controller;

import com.example.Test.Entity.Recomm;
import com.example.Test.Service.RecommService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommService ser;

    public RecommendationController(RecommService ser) {
        this.ser = ser;
    }

    @GetMapping("/user/{userId}")
    public List<RecommendationController> getUserRecomm(@PathVariable Long userId) {
        return ser.getRecommForUser(userId);
    }

    @PostMapping
    public Recomm addRecommendation(@RequestBody Recomm recomm) {
        return ser.saveRecomm(recomm);
    }
}
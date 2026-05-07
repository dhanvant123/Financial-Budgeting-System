package com.example.Test.Repository;

import com.example.Test.Entity.Recomm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommRepository extends JpaRepository<Recomm, Long> {
    List<Recomm> findByUserId(Long userId);
}
package com.example.Test.Repository;

import com.example.Test.Entity.Recomm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommRepository extends JpaRepository<Recomm, Long> {

    List<Recomm> findByUserId(Long userId);
}
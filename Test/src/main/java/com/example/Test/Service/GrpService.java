package com.example.Test.Service;

import com.example.Test.Entity.Grp;
import com.example.Test.Repository.GrpRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrpService {

    private final GrpRepository repo;

    public GrpService(GrpRepository repo) {
        this.repo = repo;
    }

    public Grp createGroup(Grp grp) {
        return repo.save(grp);
    }

    public List<Grp> getAllGrps() {
        return repo.findAll();
    }

    public Grp getGrpById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteGrp(Long id) {
        repo.deleteById(id);
    }
}
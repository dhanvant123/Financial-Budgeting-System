package com.example.Test.Controller;

import com.example.Test.Entity.Grp;
import com.example.Test.Service.GrpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GrpController {

    private final GrpService ser;

    public GrpController(GrpService ser) {
        this.ser = ser;
    }

    @PostMapping
    public Grp createGrp(@RequestBody Grp grp) {
        return ser.createGrp(grp);
    }

    @GetMapping
    public List<Grp> getAllGrps() {
        return ser.getAllGrps();
    }

    @DeleteMapping("/{id}")
    public String deleteGrp(@PathVariable Long id) {
        ser.deleteGrp(id);
        return "Group deleted successfully";
    }
}
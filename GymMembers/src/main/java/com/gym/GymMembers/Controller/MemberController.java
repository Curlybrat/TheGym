package com.gym.GymMembers.Controller;

import com.gym.GymMembers.Entity.GymMembers;
import com.gym.GymMembers.Service.serviceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gymMembers")
public class MemberController {

    @Autowired
    serviceImplementation serv;

    @GetMapping("/getAllMembers")
    public ResponseEntity<List<GymMembers>> GetAllGymMembers(){
        return serv.allGymMembers();
    }

    @GetMapping("/member{id}/")
    public ResponseEntity<GymMembers> getMemberById(@RequestParam long id){
        return serv.gymMember(id);
    }

    @PostMapping("/addMembers")
    public ResponseEntity<GymMembers> AddMembers(@RequestBody GymMembers members){
        return serv.addMember(members);
    }

    @DeleteMapping("/deleteMember{id}")
    public ResponseEntity<GymMembers> DeleteMembers(@RequestParam long id){
        return serv.deleteMember(id);
    }
}

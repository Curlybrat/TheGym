package com.gym.GymMembers.Service;

import com.gym.GymMembers.Dao.Repository;
import com.gym.GymMembers.Entity.GymMembers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class serviceImplementation implements serviceInterface{

    @Autowired
    Repository repo;

    @Override
    public ResponseEntity<List<GymMembers>> allGymMembers() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GymMembers> gymMember(long id) {
        return new ResponseEntity<>(repo.getReferenceById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GymMembers> addMember(GymMembers members) {
        return new ResponseEntity<>(repo.save(members),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<GymMembers> deleteMember(long id) {
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

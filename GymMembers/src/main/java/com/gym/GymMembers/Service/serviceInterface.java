package com.gym.GymMembers.Service;

import com.gym.GymMembers.Entity.GymMembers;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface serviceInterface {

    public ResponseEntity<List<GymMembers>> allGymMembers();

    public ResponseEntity<GymMembers> gymMember(long id);

    public ResponseEntity<GymMembers> addMember(GymMembers members);

    public ResponseEntity<GymMembers> deleteMember(long id);

}

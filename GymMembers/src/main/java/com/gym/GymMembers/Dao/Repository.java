package com.gym.GymMembers.Dao;

import com.gym.GymMembers.Entity.GymMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<GymMembers,Long> {
}

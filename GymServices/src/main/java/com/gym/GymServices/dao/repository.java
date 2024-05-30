package com.gym.GymServices.dao;

import com.gym.GymServices.Entity.GymServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<GymServices,String> {
}

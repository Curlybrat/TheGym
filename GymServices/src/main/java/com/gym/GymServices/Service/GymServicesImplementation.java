package com.gym.GymServices.Service;

import com.gym.GymServices.Entity.GymServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.gym.GymServices.dao.repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GymServicesImplementation implements GymserviceInterface {

    @Autowired
    repository repo;

    @Override
    public ResponseEntity<List<GymServices>> allGymServices() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GymServices> gymService(String packageId) {
        return new ResponseEntity<>(repo.getReferenceById(packageId),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GymServices> addServices(GymServices services) {
        return new ResponseEntity<>(repo.save(services), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<GymServices> deleteServices(String packageId) {
        repo.deleteById(packageId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

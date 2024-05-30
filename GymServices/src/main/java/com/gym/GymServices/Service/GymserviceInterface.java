package com.gym.GymServices.Service;

import com.gym.GymServices.Entity.GymServices;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GymserviceInterface {

    public ResponseEntity<List<GymServices>> allGymServices();

    public ResponseEntity<GymServices> gymService(String packageId);

    public ResponseEntity<GymServices> addServices(GymServices services);

    public ResponseEntity<GymServices> deleteServices(String PackageId);

}

package com.gym.GymServices.Controller;

import com.gym.GymServices.Entity.GymServices;
import com.gym.GymServices.Service.GymServicesImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gymServices")
public class GymServiceController {

    @Autowired
    GymServicesImplementation serv;

    @GetMapping("/getAllServices")
    public ResponseEntity<List<GymServices>> GetAllGymServices(){
        return serv.allGymServices();
    }

    @GetMapping("/service{id}/")
    public ResponseEntity<GymServices> getServiceById(@RequestParam String packageId){
        return serv.gymService(packageId);
    }

    @PostMapping("/addService")
    public ResponseEntity<GymServices> AddServices(@RequestBody GymServices Service){
        return serv.addServices(Service);
    }

    @DeleteMapping("/deleteService{id}")
    public ResponseEntity<GymServices> DeleteServices(@RequestParam String packageId){
        return serv.deleteServices(packageId);
    }
}

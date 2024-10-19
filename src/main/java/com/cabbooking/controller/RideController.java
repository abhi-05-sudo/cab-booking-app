
package com.cabbooking.controller;

import com.cabbooking.model.Ride;
import com.cabbooking.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping("/book")
    public ResponseEntity<Ride> bookRide(@RequestBody RideRequest rideRequest) {
        Ride ride = rideService.bookRide(rideRequest.getUser(), 
                                         rideRequest.getStartLocation(), 
                                         rideRequest.getDestination());
        return ResponseEntity.ok(ride);
    }
}

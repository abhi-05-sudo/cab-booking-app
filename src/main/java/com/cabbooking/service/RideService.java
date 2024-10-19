
package com.cabbooking.service;

import com.cabbooking.model.Ride;
import com.cabbooking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    public Ride bookRide(User user, String startLocation, String destination) {
        Ride ride = new Ride(user, startLocation, destination);
        return rideRepository.save(ride);
    }
}

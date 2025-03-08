package com.buyogo.assignment.controllers;

import com.buyogo.assignment.entities.TrainingCenter;
import com.buyogo.assignment.services.TrainingCenterServices;
import com.buyogo.assignment.services.TrainingCenterServicesImpl;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/training-centers")
public class TrainingCenterController {

    private final TrainingCenterServices trainingCenterServices;

    // Constructor-based dependency injection for service layer
    public TrainingCenterController(TrainingCenterServices trainingCenterServices) {
        this.trainingCenterServices = trainingCenterServices;
    }

    //    post API to create a Training center
    @PostMapping("/create")
    public ResponseEntity<?> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter){
        TrainingCenter savedTrainingCenter = trainingCenterServices.createTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedTrainingCenter, HttpStatus.CREATED);
    }

//    Get API to fetch the list of Training centers
    @GetMapping("/get")
    public ResponseEntity<?> getTrainingCenter(
            @RequestParam(required = false) String state,
            @RequestParam(required = false) Integer minimumCapacity ){

        List<TrainingCenter> trainingCenterList = trainingCenterServices.getFilteredTrainingCenters(state, minimumCapacity);
        return new ResponseEntity<>(trainingCenterList, HttpStatus.OK);
    }
}

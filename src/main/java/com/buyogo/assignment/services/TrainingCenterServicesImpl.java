package com.buyogo.assignment.services;

import com.buyogo.assignment.entities.TrainingCenter;
import com.buyogo.assignment.repositories.TrainigCenterRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//Implementation of TrainingCenterServices interface.
//Handles business logic for training centers.
@Service
public class TrainingCenterServicesImpl implements  TrainingCenterServices{

    private final TrainigCenterRepo trainigCenterRepo;

    // Constructor injection for repository
    public TrainingCenterServicesImpl(TrainigCenterRepo trainigCenterRepo) {
        this.trainigCenterRepo = trainigCenterRepo;
    }

    @Override
    public List<TrainingCenter> getFilteredTrainingCenters(String state, Integer minimumCapacity){
        List<TrainingCenter> centers = trainigCenterRepo.findAll();

        if(state != null){
            centers = centers.stream()
                    .filter(center -> center.getAddress().getState().equalsIgnoreCase(state))
                    .collect(Collectors.toList());

        }
        if(minimumCapacity != null){
            centers = centers.stream()
                    .filter(center -> center.getStudentCapacity() >= minimumCapacity)
                    .collect(Collectors.toList());
        }
        return centers;
    }

    @Override
    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        return trainigCenterRepo.save(trainingCenter);
    }
}

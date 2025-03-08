package com.buyogo.assignment.services;

import com.buyogo.assignment.entities.TrainingCenter;

import java.util.List;

//Service interface defining operations for TrainingCenter.
public interface TrainingCenterServices {
    TrainingCenter createTrainingCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> getFilteredTrainingCenters(String State, Integer minimumCapacity);
}

package com.buyogo.assignment.repositories;

import com.buyogo.assignment.entities.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


//Repository interface for TrainingCenter.
// extends MongoRepository to provide CRUD operations
@Repository
public interface TrainigCenterRepo extends MongoRepository<TrainingCenter, String> {
}

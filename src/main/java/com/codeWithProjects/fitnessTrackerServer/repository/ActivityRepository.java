package com.codeWithProjects.fitnessTrackerServer.repository;


import com.codeWithProjects.fitnessTrackerServer.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity , Long> {



    @Query("SELECT SUM(a.steps) FROM Activity a")
    Integer getTotalSteps();
    @Query("SELECT SUM(a.distance) FROM Activity a")
    double getTotalDistance();
    @Query("SELECT SUM(a.caloriesBurned) FROM Activity a")
    Integer getTotalCaloriesBurned();

}

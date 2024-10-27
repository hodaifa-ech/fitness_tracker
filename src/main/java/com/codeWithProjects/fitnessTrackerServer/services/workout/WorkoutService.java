package com.codeWithProjects.fitnessTrackerServer.services.workout;


import com.codeWithProjects.fitnessTrackerServer.dto.WorkoutDTO;
import com.codeWithProjects.fitnessTrackerServer.entity.Workout;
import com.codeWithProjects.fitnessTrackerServer.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class WorkoutService implements WorkoutServiceImpl {

   private final WorkoutRepository workoutRepository;

   public WorkoutDTO postWorkout(WorkoutDTO workoutDTO) {


       Workout workout = new Workout();

       workout.setDate(workoutDTO.getDate());
       workout.setType(workoutDTO.getType());
       workout.setDuration(workoutDTO.getDuration());
       workout.setCaloriesBurned(workoutDTO.getCaloriesBurned());
       return  workoutRepository.save(workout).getWorkoutDTO();
   }

   public List<WorkoutDTO> getWorkouts() {
       List<Workout> workouts = workoutRepository.findAll();
     return workouts.stream().map(Workout::getWorkoutDTO).collect(Collectors.toList());

   }

}

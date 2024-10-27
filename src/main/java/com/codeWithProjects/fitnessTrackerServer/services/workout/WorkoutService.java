package com.codeWithProjects.fitnessTrackerServer.services.workout;


import com.codeWithProjects.fitnessTrackerServer.dto.WorkoutDTO;
import com.codeWithProjects.fitnessTrackerServer.entity.Workout;
import com.codeWithProjects.fitnessTrackerServer.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


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

}

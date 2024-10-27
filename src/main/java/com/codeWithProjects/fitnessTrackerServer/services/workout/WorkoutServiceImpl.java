package com.codeWithProjects.fitnessTrackerServer.services.workout;

import com.codeWithProjects.fitnessTrackerServer.dto.WorkoutDTO;

public interface WorkoutServiceImpl {
    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);
}


package com.codeWithProjects.fitnessTrackerServer.services.goal;

import com.codeWithProjects.fitnessTrackerServer.dto.GoalDTO;

public interface GoalServiceImpl {
    GoalDTO postGoal(GoalDTO goalDTO);
}

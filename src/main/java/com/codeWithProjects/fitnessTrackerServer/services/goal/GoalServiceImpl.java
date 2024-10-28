package com.codeWithProjects.fitnessTrackerServer.services.goal;

import com.codeWithProjects.fitnessTrackerServer.dto.GoalDTO;

import java.util.List;

public interface GoalServiceImpl {
    GoalDTO postGoal(GoalDTO goalDTO);
    List<GoalDTO> getGoals();
    GoalDTO updateStatus(Long id);
}

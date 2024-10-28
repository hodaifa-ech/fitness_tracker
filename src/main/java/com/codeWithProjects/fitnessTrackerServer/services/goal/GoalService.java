package com.codeWithProjects.fitnessTrackerServer.services.goal;


import com.codeWithProjects.fitnessTrackerServer.dto.ActivityDTO;
import com.codeWithProjects.fitnessTrackerServer.dto.GoalDTO;
import com.codeWithProjects.fitnessTrackerServer.entity.Activity;
import com.codeWithProjects.fitnessTrackerServer.entity.Goal;
import com.codeWithProjects.fitnessTrackerServer.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GoalService implements GoalServiceImpl {


    private final GoalRepository goalRepository;


    public GoalDTO postGoal(GoalDTO goalDTO) {
        Goal goal = new Goal();
        goal.setDescription(goalDTO.getDescription());
        goal.setStartDate(goalDTO.getStartDate());
        goal.setEndDate(goalDTO.getEndDate());
        goal.setAchieved(goalDTO.isAchieved());
        return goalRepository.save(goal).convertToDTO();

    }
    public List<GoalDTO> getGoals() {
        List<Goal> goals = goalRepository.findAll();
        return goals.stream().map(Goal::convertToDTO).collect(Collectors.toList());
    }
}

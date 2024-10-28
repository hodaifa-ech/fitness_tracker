package com.codeWithProjects.fitnessTrackerServer.services.stats;


import com.codeWithProjects.fitnessTrackerServer.dto.StatsDTO;
import com.codeWithProjects.fitnessTrackerServer.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service()
@RequiredArgsConstructor
public class StatsService {

    private final GoalRepository goalRepository;


    public StatsDTO getStats(){
        Long achivedGoal=goalRepository.countAchievedGoals();
        Long notAchievedGoals= goalRepository.countNotAchievedGoals();
        StatsDTO statsDTO = new StatsDTO();
        statsDTO.setAchievedGoals(achivedGoal!=null?achivedGoal:0);
        statsDTO.setNotAchievedGoals(notAchievedGoals!=null?notAchievedGoals:0);
        return statsDTO;
    }
}

package com.codeWithProjects.fitnessTrackerServer.services.stats;


import com.codeWithProjects.fitnessTrackerServer.dto.StatsDTO;
import com.codeWithProjects.fitnessTrackerServer.repository.ActivityRepository;
import com.codeWithProjects.fitnessTrackerServer.repository.GoalRepository;
import com.codeWithProjects.fitnessTrackerServer.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service()
@RequiredArgsConstructor
public class StatsService {

    private final GoalRepository goalRepository;
    private final ActivityRepository activityRepository;
    private final WorkoutRepository workoutRepository;


    public StatsDTO getStats(){
        Long achivedGoal=goalRepository.countAchievedGoals();
        Long notAchievedGoals= goalRepository.countNotAchievedGoals();

        Integer totalSteps= activityRepository.getTotalSteps();
         Double totalDistance =activityRepository.getTotalDistance();
          Integer totalActivityCaloriesBurned= activityRepository.getTotalCaloriesBurned();


          Integer Totalduration =workoutRepository.getDuration();
        Integer TotalWorkoutcaloriesBurned=workoutRepository.getCaloriesBurned();

        int TotalCaloriesBurned= (totalActivityCaloriesBurned != null? totalActivityCaloriesBurned : 0)+
                   (TotalWorkoutcaloriesBurned!=null?TotalWorkoutcaloriesBurned:0);
        StatsDTO statsDTO = new StatsDTO();
        statsDTO.setAchievedGoals(achivedGoal!=null?achivedGoal:0);
        statsDTO.setNotAchievedGoals(notAchievedGoals!=null?notAchievedGoals:0);

        statsDTO.setSteps(totalSteps!=null?totalSteps:0);
        statsDTO.setDistance(totalDistance!=null?totalDistance:0);
        statsDTO.setTotalCaloriesBurned(TotalCaloriesBurned);

        statsDTO.setDuration(Totalduration!=null?Totalduration:0);

        return statsDTO;
    }



}

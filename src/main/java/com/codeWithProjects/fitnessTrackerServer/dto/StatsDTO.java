package com.codeWithProjects.fitnessTrackerServer.dto;


import lombok.Data;

@Data
public class StatsDTO {

    private Long  achievedGoals;


    private  Long notAchievedGoals;

    private int steps;
    private double distance;
    private  int totalCaloriesBurned;

   private int duration;


}

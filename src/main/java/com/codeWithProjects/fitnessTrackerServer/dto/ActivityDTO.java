package com.codeWithProjects.fitnessTrackerServer.dto;


import lombok.Data;

import java.util.Date;

@Data
public class ActivityDTO {

    private long id;

    private Date date;


    private  int steps;

    private double distance;

    private int caloriesBurned;
}

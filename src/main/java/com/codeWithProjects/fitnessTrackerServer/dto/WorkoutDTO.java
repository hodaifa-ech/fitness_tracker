package com.codeWithProjects.fitnessTrackerServer.dto;


import lombok.Data;

import java.util.Date;

@Data

public class WorkoutDTO {
    private long id;

    private String type;
    private Date date;
    private int duration;
    private int caloriesBurned;


}

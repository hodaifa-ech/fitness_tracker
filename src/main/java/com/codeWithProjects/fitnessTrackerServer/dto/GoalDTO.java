package com.codeWithProjects.fitnessTrackerServer.dto;


import lombok.Data;

import java.util.Date;

@Data

public class GoalDTO {

    private long id;

    private String description;
    private Date startDate;
    private Date endDate;

    private boolean achieved;
}

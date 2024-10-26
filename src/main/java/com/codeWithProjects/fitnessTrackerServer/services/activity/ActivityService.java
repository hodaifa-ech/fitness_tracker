package com.codeWithProjects.fitnessTrackerServer.services.activity;

import com.codeWithProjects.fitnessTrackerServer.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);
    List<ActivityDTO> getActivities();
}

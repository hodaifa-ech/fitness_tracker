package com.codeWithProjects.fitnessTrackerServer.services.activity;

import com.codeWithProjects.fitnessTrackerServer.dto.ActivityDTO;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);
}

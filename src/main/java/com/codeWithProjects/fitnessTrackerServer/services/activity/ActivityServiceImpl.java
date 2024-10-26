package com.codeWithProjects.fitnessTrackerServer.services.activity;


import com.codeWithProjects.fitnessTrackerServer.dto.ActivityDTO;
import com.codeWithProjects.fitnessTrackerServer.entity.Activity;
import com.codeWithProjects.fitnessTrackerServer.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements  ActivityService{

    private  final ActivityRepository activityRepository;


    public ActivityDTO postActivity(ActivityDTO dto) {
        Activity activity = new Activity();
        activity.setDate(dto.getDate());
        activity.setSteps(dto.getSteps());
        activity.setDistance(dto.getDistance());
        activity.setCaloriesBurned(dto.getCaloriesBurned());

        return activityRepository.save(activity).getActivityDto();
    }

    public List<ActivityDTO> getActivities() {
        List<Activity> activities = activityRepository.findAll();
        return activities.stream().map(Activity::getActivityDto).collect(Collectors.toList());
    }
}

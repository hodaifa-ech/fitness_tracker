package com.codeWithProjects.fitnessTrackerServer.repository;

import com.codeWithProjects.fitnessTrackerServer.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GoalRepository extends JpaRepository<Goal, Long> {
}

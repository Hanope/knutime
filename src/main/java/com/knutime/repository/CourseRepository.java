package com.knutime.repository;

import com.knutime.domain.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByTitleStartingWithAndSemesterOrCodeStartingWithAndSemester(String courseName, String semester, String code, String semester2);

    Course findOne(Long id);
}

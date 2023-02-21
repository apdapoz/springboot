package io.springgaming.SpringTestData.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    //Spring Data JPA will implement the method based on keywords from the definition
    public List<Course> findByTopicId(String topicId);

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String description);
}

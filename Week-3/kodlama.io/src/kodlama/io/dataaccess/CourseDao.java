package kodlama.io.dataaccess;

import kodlama.io.entities.Course;

import java.util.List;

public interface CourseDao {

    void add(Course course);
    List<Course> GetAllCourses();
}

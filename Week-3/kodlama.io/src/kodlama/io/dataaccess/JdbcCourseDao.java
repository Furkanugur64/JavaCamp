package kodlama.io.dataaccess;

import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    private List<Course> courses=new ArrayList<Course>();
    @Override
    public void add(Course course) {
        System.out.println("\n\nJDBC ile kurs eklendi : "+course.courseName);
    }

    @Override
    public List<Course> GetAllCourses() {
        return courses;
    }



}

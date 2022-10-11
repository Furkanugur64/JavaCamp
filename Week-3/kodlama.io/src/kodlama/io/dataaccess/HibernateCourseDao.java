package kodlama.io.dataaccess;

import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao{
    private List<Course> courses=new ArrayList<Course>();
    @Override
    public void add(Course course) {
        System.out.println("\nHibernate ile kurs eklendi : "+course.courseName);
    }

    @Override
    public List<Course> GetAllCourses() {
        return courses;
    }


}

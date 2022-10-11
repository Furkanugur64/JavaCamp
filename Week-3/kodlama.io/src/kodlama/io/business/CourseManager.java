package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataaccess.CourseDao;
import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    CourseDao _courseDao;
    Logger[] loggers;

    public CourseManager(CourseDao _courseDao, Logger[] loggers) {
        this._courseDao = _courseDao;
        this.loggers = loggers;
    }
    List<Course> courses=new ArrayList<Course>();
    public void add(Course course1) throws Exception{

        if (course1.getprice()<0){
            throw new Exception("Kursun Fiyatı 0'dan küçük olamaz.");

        }
        for (Course course:courses){
            if (course.getCourseName()==course1.getCourseName()){
                throw new Exception("Kurs isimleri aynı olamaz");
            }
        }
        courses.add(course1);
        _courseDao.add(course1);

        for (Logger logger:loggers) {
            logger.log(course1.getCourseName());
        }

    }

    }





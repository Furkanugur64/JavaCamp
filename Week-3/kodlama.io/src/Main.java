import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataaccess.HibernateCourseDao;
import kodlama.io.dataaccess.JdbcCategoryDao;
import kodlama.io.dataaccess.JdbcCourseDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Category category1=new Category(1,"Programlama");
        Category category2=new Category(2,"Yazılım Geliştirme");

        Course course1=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",500);
        Course course2=new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",500);
        Course course3=new Course(3,"Programlamaya Giriş için Temel Kurs",500);
        Logger[] loggers={ new DatabaseLogger(),new FileLogger()};

        CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course1);
         courseManager.add(course2);
        courseManager.add(course3);


        CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
        //categoryManager.add(category1);
        //categoryManager.add(category2);



    }
}
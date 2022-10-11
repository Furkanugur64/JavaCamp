package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataaccess.CategoryDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    Logger[] loggers;
    CategoryDao _categoryDao;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.loggers = loggers;
        this._categoryDao = categoryDao;
    }

    List<Category> categories=new ArrayList<Category>();
    public void add(Category category) throws Exception{

        for (Category category1:categories){
            if (category1.getCategoryName()==category.getCategoryName()){
                throw new Exception("Kurs isimleri aynı olamaz");
            }
        }
        categories.add(category);
        _categoryDao.add(category);

        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());
        }

    }




}

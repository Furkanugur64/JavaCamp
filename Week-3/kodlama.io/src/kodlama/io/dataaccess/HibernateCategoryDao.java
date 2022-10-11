package kodlama.io.dataaccess;

import kodlama.io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao{
    private List<Category> categories=new ArrayList<Category>();
    @Override
    public void add(Category category) {
        System.out.println("\nHibernate ile kategori eklendi : "+category.categoryName);
    }

    @Override
    public List<Category> GetAllCategory() {
        return categories;
    }


}


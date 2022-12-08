package oopWithNLayeredApp.dataAccess.categoryDao;

import oopWithNLayeredApp.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void remove(Category category);
    void update(Category category);
}

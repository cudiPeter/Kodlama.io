package oopWithNLayeredApp.dataAccess.categoryDao;

import oopWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile veritabanına eklendi.");
    }

    @Override
    public void remove(Category category) {
        System.out.println("Kategori JDBC ile veritabanından silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori JDBC ile veritabanında güncellendi.");
    }
}

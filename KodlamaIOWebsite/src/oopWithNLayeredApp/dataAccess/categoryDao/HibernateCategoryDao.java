package oopWithNLayeredApp.dataAccess.categoryDao;

import oopWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void remove(Category category) {
        System.out.println("Kategori Hibernate ile veritabanından silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori Hibernate ile veritabanında güncellendi.");
    }
}

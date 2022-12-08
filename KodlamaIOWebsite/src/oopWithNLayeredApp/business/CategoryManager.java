package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.categoryDao.CategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category){
        categoryDao.add(category);

        for (Logger logger:loggers){
            logger.categoryLog(category.getCategoryName()+" kategori listesine eklenmiştir.");
        }
    }
    public void remove(Category category){
        categoryDao.add(category);

        for (Logger logger:loggers){
            logger.categoryLog(category.getCategoryName()+" kategori listesinden silinmiştir.");
        }
    }
    public void update(Category category){
        categoryDao.add(category);

        for (Logger logger:loggers){
            logger.categoryLog(category.getCategoryName()+" kategori listesinde güncellenmiştir.");
        }
    }

}

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.InstructorManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.categoryDao.JdbcCategoryDao;
import oopWithNLayeredApp.dataAccess.courseDao.JdbcCourseDao;
import oopWithNLayeredApp.dataAccess.instructorDao.HibernateInstructorDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Instructor;

public class Main {

    public static void main(String[] args) throws Exception {

        Logger[] loggers ={new DatabaseLogger()};       // DB,FILE,EMAIL,ELASTICSEARCH

        Instructor instructor1 = new Instructor(1,"Engin","DEMIROG");
        Instructor instructor2 = new Instructor(2,"Cüneyt","ÇOKER");
        Instructor instructor3 = new Instructor(3,"Beste","ARI");

        InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),loggers);    // JDBC,HIBERNATE
        instructorManager.add(instructor1);         // ADD,REMOVE,UPDATE
        instructorManager.update(instructor2);
        instructorManager.remove(instructor3);

        System.out.println("------------------------------------------------------");


        Category category1 = new Category(1,"PROGRAMLAMA");
        Category category2 = new Category(2,"ALGORITMA");
        Category category3 = new Category(3,"GRAPHIC");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category1);
        categoryManager.remove(category2);
        categoryManager.update(category3);

        System.out.println("------------------------------------------------------");


        Course course1 = new Course(1,"Programlamaya Giriş için Temel Kurs",400,new Instructor(1,"Engin","DEMIROG"),new Category(1,"PROGRAMLAMA"));
        Course course2 = new Course(2,"JAVA Yazılım Geliştirici Yetiştirme Kampı",400,new Instructor(1,"Engin","DEMIROG"),new Category(1,"PROGRAMLAMA"));
        Course course3 = new Course(3,"JAVA+REACT Yazılım Geliştirici Yetiştirme Kampı",400,new Instructor(1,"Engin","DEMIROG"),new Category(1,"PROGRAMLAMA"));
        Course course4 = new Course(4,"C#+ANGULAR Yazılım Geliştirici Yetiştirme Kampı",400,new Instructor(1,"Engin","DEMIROG"),new Category(1,"PROGRAMLAMA"));
        Course course5 = new Course(5,"JavaScript Yazılım Geliştirici Yetiştirme Kampı",400,new Instructor(1,"Engin","DEMIROG"),new Category(1,"PROGRAMLAMA"));
        Course course6 = new Course(6,".NET Senior Yazılım Geliştirici Yetiştirme Kampı",-1,new Instructor(1,"Engin","DEMIROG"),new Category(1,"PROGRAMLAMA"));

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course1);
        courseManager.remove(course2);
        courseManager.update(course3);
        courseManager.update(course4);
        courseManager.update(course5);
        courseManager.update(course6);
    }
}
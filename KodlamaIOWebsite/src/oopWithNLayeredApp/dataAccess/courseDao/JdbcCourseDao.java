package oopWithNLayeredApp.dataAccess.courseDao;

import oopWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs JDBC ile veritabanına eklendi.");
    }

    @Override
    public void remove(Course course) {
        System.out.println("Kurs JDBC ile veritabanından silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Kurs JDBC ile veritabanında güncellendi.");
    }
}

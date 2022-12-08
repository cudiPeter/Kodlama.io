package oopWithNLayeredApp.dataAccess.courseDao;

import oopWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void remove(Course course) {
        System.out.println("Kurs Hibernate ile veritabanından silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Kurs Hibernate ile veritabanında güncellendi.");
    }
}

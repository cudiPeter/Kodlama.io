package oopWithNLayeredApp.dataAccess.courseDao;

import oopWithNLayeredApp.entities.Course;

public interface CourseDao {
    void add(Course course);
    void remove(Course course);
    void update(Course course);
}

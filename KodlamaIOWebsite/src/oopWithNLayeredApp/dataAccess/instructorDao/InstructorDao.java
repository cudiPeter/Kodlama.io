package oopWithNLayeredApp.dataAccess.instructorDao;

import oopWithNLayeredApp.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void remove(Instructor instructor);
    void update(Instructor instructor);
}

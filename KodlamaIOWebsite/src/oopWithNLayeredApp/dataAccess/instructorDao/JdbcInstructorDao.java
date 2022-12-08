package oopWithNLayeredApp.dataAccess.instructorDao;

import oopWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen JDBS ile veritabanına eklendi.");
    }

    @Override
    public void remove(Instructor instructor) {
        System.out.println("Eğitmen JDBS ile veritabanından silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Eğitmen JDBS ile veritabanında güncellendi.");
    }
}

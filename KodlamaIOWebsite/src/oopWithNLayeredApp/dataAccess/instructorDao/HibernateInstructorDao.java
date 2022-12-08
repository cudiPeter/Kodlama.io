package oopWithNLayeredApp.dataAccess.instructorDao;

import oopWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void remove(Instructor instructor) {
        System.out.println("Eğitmen Hibernate ile veritabanından silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Eğitmen Hibernate ile veritabanında güncellendi.");
    }
}
